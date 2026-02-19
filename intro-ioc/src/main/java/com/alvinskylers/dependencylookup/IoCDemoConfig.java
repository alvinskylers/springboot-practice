package com.alvinskylers.dependencylookup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IoCDemoConfig {

    @Bean
    public GreetingProvider provider(){
        return new MyGreetingProvider();
    }

    @Bean
    public GreetingRenderer renderer() {
        GreetingRenderer renderer = new MyGreetingRenderer();
        renderer.setGreetingProvider(provider());
        return renderer;
    }
}
