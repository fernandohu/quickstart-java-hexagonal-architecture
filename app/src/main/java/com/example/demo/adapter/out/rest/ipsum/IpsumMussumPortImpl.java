package com.example.demo.adapter.out.rest.ipsum;

import com.example.demo.core.togglefeature.ToggleCommand;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumRequestDto;
import com.example.demo.adapter.out.rest.ipsum.dto.IpsumResponseDto;
import com.example.demo.core.togglefeature.Features;
import org.springframework.stereotype.Component;

@Component
public class IpsumMussumPortImpl implements ToggleCommand<IpsumRequestDto, IpsumResponseDto> {

    @Override
    public boolean canExecute() {
        return Features.MUSSUM_IPSUM.isActive() == true;
    }

    @Override
    public IpsumResponseDto execute(IpsumRequestDto in) {

        /* We should have an REST request here to generate Mussum Ipsum */

        IpsumResponseDto response = new IpsumResponseDto();
        response.setTitle("Mussum Ipsum");
        response.setImage("http://s2.glbimg.com/Wbzg3io0pmCPhSvIBQGz7gGL3W8=/0x0:1185x700/695x411/s.glbimg.com/po/tt2/f/original/2014/06/11/untitled-5.jpg");

        for (int i = 0; i < in.getParagraphs(); i++) {
            response.setBody(response.getBody() + "<p>Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.</p>");
        }

        return response;
    }
}
