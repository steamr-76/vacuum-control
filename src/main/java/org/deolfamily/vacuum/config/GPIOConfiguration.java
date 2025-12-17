package org.deolfamily.vacuum.config;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.io.gpio.digital.impl.DefaultDigitalOutputConfigBuilder;
import org.deolfamily.vacuum.service.GPIOPin;
import org.deolfamily.vacuum.service.OnOffDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnProperty(name = "gpio.simulate", havingValue = "false")
public class GPIOConfiguration {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${gpio.pin:18}")
    private int bcmPinNumber;

    @Value("${gpio.startup-state:HIGH}")
    private DigitalState startupState;

    @Bean
    public OnOffDevice vacuumOnOffDevice() {
        log.info("*** Using real Raspberry PI pin (bcm) {}", bcmPinNumber);
        var pi4j = Pi4J.newAutoContext();
        var config = DefaultDigitalOutputConfigBuilder.newInstance(pi4j)
                .initial(startupState)
                .shutdown(startupState)
                .address(bcmPinNumber)
                .build();
        DigitalOutput digitalOutput = pi4j.digitalOutput().create(config);
        digitalOutput.state(startupState);
        return new GPIOPin(digitalOutput);
    }
}
