package com.example.demo.adapter.in.rest.tax;

import com.example.demo.adapter.in.rest.tax.dto.TaxControllerRequestDto;
import com.example.demo.adapter.in.rest.tax.dto.TaxControllerResponseDto;
import com.example.demo.adapter.out.rest.tax.dto.TaxRequestDto;
import com.example.demo.adapter.out.rest.tax.dto.TaxResponseDto;
import com.example.demo.core.domains.tax.ports.in.CalculateTaxUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {
    @Autowired
    CalculateTaxUseCase calculateTaxUseCase;

    @GetMapping(value = "/tax")
    public TaxControllerResponseDto calculateTax(TaxControllerRequestDto params) {
        double resultAmount = calculateTaxUseCase.calculate(params.getAmount());

        TaxControllerResponseDto response = new TaxControllerResponseDto();
        response.setAmount(resultAmount);

        return response;
    }
}
