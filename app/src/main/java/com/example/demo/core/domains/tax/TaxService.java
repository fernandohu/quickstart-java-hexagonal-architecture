package com.example.demo.core.domains.tax;

import com.example.demo.adapter.out.rest.tax.dto.TaxResponseDto;
import com.example.demo.core.domains.tax.ports.in.CalculateTaxUseCase;
import com.example.demo.core.domains.tax.ports.out.TaxPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxService implements CalculateTaxUseCase {
    @Autowired
    TaxPort port;

    @Override
    public double calculate(double amount) {
        return port.calculate(amount);
    }
}
