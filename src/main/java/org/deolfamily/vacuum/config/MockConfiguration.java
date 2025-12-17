package org.deolfamily.vacuum.config;

import org.deolfamily.vacuum.service.MemoryPin;
import org.deolfamily.vacuum.service.OnOffDevice;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.slf4j.LoggerFactory.getLogger;

@Configuration
@ConditionalOnProperty(name = "gpio.simulate", havingValue = "true", matchIfMissing = true)
public class MockConfiguration {
    private final Logger log = getLogger(this.getClass());

    @Bean
    public OnOffDevice InMemoryVacuumMachine() {
        log.info("*** Simulating GPIO");
        return new MemoryPin();
    }
}
