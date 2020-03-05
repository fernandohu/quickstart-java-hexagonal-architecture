package com.example.demo.adapter.out.rest.tax;

import com.example.demo.adapter.out.mainframe.tax.TaxLegacyService;
import com.example.demo.adapter.out.rest.tax.dto.TaxRequestDto;
import com.example.demo.adapter.out.rest.tax.dto.TaxResponseDto;
import com.example.demo.core.domains.tax.ports.out.TaxPort;
import com.example.demo.core.togglefeature.ToggleExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxPortImpl implements TaxPort {
    @Autowired
    ToggleExecutor<TaxRequestDto, TaxResponseDto> service;

    @Autowired
    TaxLegacyService taxLegacyService;

    @Autowired
    TaxNewPortImpl taxService;

    @Override
    public double calculate(double amount) {
        service
            .add(taxLegacyService)
            .add(taxService);

        TaxResponseDto response = service.executeOne(getParams(amount));
        return response.getValue();
    }

    private TaxRequestDto getParams(double amount) {
        TaxRequestDto params = new TaxRequestDto();
        params.setAmount(amount);
        return params;
    }
}
