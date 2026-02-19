package com.alvinskylers.dependencyinjection.example;

public class ConstructorInjectionExample {

    // required dependency
    private Dependency dependency;

    // use the constructor to let Spring inject the dependency
    public ConstructorInjectionExample(Dependency dependency) {
        this.dependency = dependency;
    }

    //NOTE: This code sample assumes that the Dependency bean has already been appropriately registered with the ApplicationContext.
}
