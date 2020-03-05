package com.example.demo.adapter.out.rest.ipsum;

import com.example.demo.adapter.out.mainframe.ipsum.IpsumMainframePortImpl;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumRequestDto;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumResponseDto;
import com.example.demo.core.domains.ipsum.ports.out.IpsumPort;
import com.example.demo.core.togglefeature.ToggleExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IpsumPortImpl implements IpsumPort {
    @Autowired
    ToggleExecutor<IpsumRequestDto, IpsumResponseDto> service;

    @Autowired
    IpsumMainframePortImpl ipsumMainframePort;

    @Autowired
    IpsumMussumPortImpl ipsumMussumPort;

    @Override
    public IpsumResponseDto generate(int paragraphs) {
        service
            .add(ipsumMainframePort)
            .add(ipsumMussumPort);

        return service.executeOne(getParams(paragraphs));
    }

    private IpsumRequestDto getParams(int paragraphs) {
        IpsumRequestDto params = new IpsumRequestDto();
        params.setParagraphs(paragraphs);
        return params;
    }
}
