package com.alvinskylers.dependencyinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConstructorInjectionDemoApp implements CommandLineRunner {

    @Autowired
    private Laptop laptop;

    public static void main(String[] args) {
        SpringApplication.run(ConstructorInjectionDemoApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // This will print the specs, including the newly injected HardDrive
        System.out.println("--- Laptop Specs Verification ---");
        System.out.println(laptop.toString());
    }
}

//Steps to perform Constructor Injection
// 1. add a new class of the item you want to inject
// 2. create a new bean in the config file
// 3. add item field to the object you want to inject