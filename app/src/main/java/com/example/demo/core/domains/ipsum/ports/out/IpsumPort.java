package com.example.demo.core.domains.ipsum.ports.out;

import com.example.demo.adapter.out.rest.ipsum.dto.IpsumResponseDto;

public interface IpsumPort {
    public IpsumResponseDto generate(int paragraphs);
}
