package com.example.demo.adapter.out.mainframe.ipsum;

import com.example.demo.core.togglefeature.ToggleCommand;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumRequestDto;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumResponseDto;
import com.example.demo.core.togglefeature.Features;
import org.springframework.stereotype.Component;

@Component
public class IpsumMainframePortImpl implements ToggleCommand<IpsumRequestDto, IpsumResponseDto> {

    @Override
    public boolean canExecute() {
        return Features.MUSSUM_IPSUM.isActive() == false;
    }

    @Override
    public IpsumResponseDto execute(IpsumRequestDto in) {

        /* We should have a request to Mainframe here */

        IpsumResponseDto response = new IpsumResponseDto();
        response.setTitle("Lorem Ipsum Legacy");
        response.setImage("https://ogimg.infoglobo.com.br/in/13664035-144-725/FT1086A/652/xlorem-ipsum-logo.jpg.pagespeed.ic.BmDLay9OMh.jpg");

        for (int i = 0; i < in.getParagraphs(); i++) {
            response.setBody(response.getBody() + "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel ligula tincidunt, bibendum diam nec, laoreet diam. Sed consectetur egestas mauris, vel venenatis orci tempus in. Sed sit amet faucibus ex. Donec efficitur sit amet nisl id sagittis. Maecenas consequat molestie urna posuere fermentum. Phasellus eleifend interdum eros sit amet fringilla. Nam posuere sit amet magna at ornare. Sed egestas venenatis nunc, et lacinia ligula suscipit a. Nulla nunc ipsum, venenatis non viverra non, imperdiet at velit. Donec luctus urna quis consectetur cursus. Mauris id magna ultricies, pulvinar elit at, sodales ante. Pellentesque volutpat finibus auctor. Aenean ligula velit, egestas id pellentesque non, egestas at ligula. Etiam vulputate nisi vitae justo interdum, at fringilla nulla tempor.</p>");
        }

        return response;
    }
}
