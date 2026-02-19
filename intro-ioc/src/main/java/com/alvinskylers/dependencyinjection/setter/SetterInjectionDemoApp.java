package com.alvinskylers.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetterInjectionDemoApp implements CommandLineRunner {

    @Autowired
    private Laptop laptop;

    public static void main(String[] args) {
        SpringApplication.run(SetterInjectionDemoApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // This will print the specs, including the newly injected HardDrive
        System.out.println("--- Laptop Specs Verification ---");
        System.out.println(laptop.toString());
    }
}
