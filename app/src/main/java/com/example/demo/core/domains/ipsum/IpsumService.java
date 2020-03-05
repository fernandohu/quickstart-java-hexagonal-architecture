package com.example.demo.core.domains.ipsum;

import com.example.demo.adapter.out.rest.ipsum.IpsumPortImpl;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumResponseDto;
import com.example.demo.core.domains.ipsum.ports.in.IpsumUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IpsumService implements IpsumUseCase {
    @Autowired
    IpsumPortImpl ipsumPort;

    @Override
    public String generate(int paragraphs) {
        IpsumResponseDto response = ipsumPort.generate(paragraphs);

        return "<h1>" + response.getTitle() + "</h1>"
                + response.getBody()
                + "<br /><img src=\"" +
                response.getImage() +
                "\" style=\"width: 300px; margin-top: 40px;\" />";
    }
}
