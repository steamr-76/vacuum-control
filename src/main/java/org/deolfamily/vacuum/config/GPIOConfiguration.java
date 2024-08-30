package org.deolfamily.vacuum.config;

import com.pi4j.io.gpio.*;
import org.deolfamily.vacuum.service.GPIOBasedOnOffDevice;
import org.deolfamily.vacuum.service.OnOffDevice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static java.lang.Boolean.TRUE;


@Configuration
@Profile({"pi"})
public class GPIOConfiguration {
    @Bean
    public GpioController gpio() {
        return GpioFactory.getInstance();
    }

    @Value("${gpio.state.default:high}")
    PinState initialState = PinState.HIGH;

    @Bean
    @Qualifier("Vacuum")
    public OnOffDevice GPIOBasedVacuumMachine(GpioController gpio) {
        GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "vacuum", initialState);
        pin.setShutdownOptions(TRUE, PinState.HIGH);

        return new GPIOBasedOnOffDevice(pin);
    }
}
