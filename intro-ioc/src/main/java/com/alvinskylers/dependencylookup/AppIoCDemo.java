package com.alvinskylers.dependencylookup;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AppIoCDemo {

    public static void main(String[] args) {
        SpringApplication.run(AppIoCDemo.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(IoCDemoConfig.class);
        GreetingRenderer greetingRenderer = ctx.getBean("renderer", GreetingRenderer.class);
        greetingRenderer.render();
    }
}
