package org.deolfamily.vacuum.config;

import org.deolfamily.vacuum.service.MemoryBasedOnOffDevice;
import org.deolfamily.vacuum.service.OnOffDevice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"mock"})
public class MockConfiguration {
    @Bean
    @Qualifier("Vacuum")
    public OnOffDevice InMemoryVacuumMachine() {
        return new MemoryBasedOnOffDevice();
    }
}
