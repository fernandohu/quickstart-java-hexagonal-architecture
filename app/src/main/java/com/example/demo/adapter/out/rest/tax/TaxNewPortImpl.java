package com.example.demo.adapter.out.rest.tax;

import com.example.demo.adapter.out.rest.tax.dto.TaxRequestDto;
import com.example.demo.adapter.out.rest.tax.dto.TaxResponseDto;
import com.example.demo.core.togglefeature.Features;
import com.example.demo.core.togglefeature.ToggleCommand;
import org.springframework.stereotype.Component;

@Component
public class TaxNewPortImpl implements ToggleCommand<TaxRequestDto, TaxResponseDto> {
    @Override
    public boolean canExecute() {
        return Features.NEW_TAX.isActive() == true;
    }

    @Override
    public TaxResponseDto execute(TaxRequestDto in) {
        TaxResponseDto response = new TaxResponseDto();
        response.setValue(in.getAmount() * 0.55);
        return response;
    }
}
