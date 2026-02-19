package com.alvinskylers.dependencyinjection.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfig {

    @Bean
    public HardDrive hardDrive(){
        return new HardDrive("SSD", 256);
    }

}
