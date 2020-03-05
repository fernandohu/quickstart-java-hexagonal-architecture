package com.example.demo.config;

import com.example.demo.adapter.out.rest.ipsum.dto.IpsumRequestDto;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumResponseDto;
import com.example.demo.adapter.out.rest.tax.dto.TaxRequestDto;
import com.example.demo.adapter.out.rest.tax.dto.TaxResponseDto;
import com.example.demo.core.togglefeature.ToggleExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToggleExecutionConfiguration {
    @Bean
    public ToggleExecutor<IpsumRequestDto, IpsumResponseDto> createIpsumBean() {
        return new ToggleExecutor<>();
    }

    @Bean
    public ToggleExecutor<TaxRequestDto, TaxResponseDto> createTaxBean() {
        return new ToggleExecutor<>();
    }
}
