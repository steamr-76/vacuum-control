package org.deolfamily.vacuum.spring.converter;

import org.deolfamily.vacuum.ws.PortState;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConverterForStringToPortState implements Converter<String, PortState> {
    public PortState convert(String source) {
        return PortState.valueOf(source.toUpperCase());
    }
}
