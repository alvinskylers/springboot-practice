package com.alvinskylers.dependencyinjection.setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfig {

    @Bean
    public HardDisk hardDisk() {
        return new HardDisk("SSD", 512);
    }

}
