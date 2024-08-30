package org.deolfamily.vacuum;

import org.deolfamily.vacuum.config.GPIOConfiguration;
import org.deolfamily.vacuum.config.MockConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({MockConfiguration.class, GPIOConfiguration.class})
public class GPIOManagerStarter {
    public static void main(String[] args) {
        SpringApplication.run(GPIOManagerStarter.class, args);
    }
}
