package com.example.demo.adapter.in.rest.ipsum;

import com.example.demo.adapter.in.rest.ipsum.dto.IpsumControllerRequestDto;
import com.example.demo.core.domains.ipsum.IpsumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpsumController {
    @Autowired
    IpsumService ipsumService;

    @GetMapping(value = "/lorem-ipsum")
    public String loremIpsum(IpsumControllerRequestDto requestDto) {
        return ipsumService.generate(requestDto.getParagraphs());
    }
}
