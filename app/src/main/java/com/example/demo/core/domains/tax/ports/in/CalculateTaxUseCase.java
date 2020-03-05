package com.example.demo.core.domains.tax.ports.in;

import org.springframework.stereotype.Component;

@Component
public interface CalculateTaxUseCase {
    public double calculate(double amount);
}
