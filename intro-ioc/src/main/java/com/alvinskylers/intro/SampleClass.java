package com.alvinskylers.intro;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleClass {

    @Bean
    public SampleClass sample() {
        return new SampleClass();
    }
}
