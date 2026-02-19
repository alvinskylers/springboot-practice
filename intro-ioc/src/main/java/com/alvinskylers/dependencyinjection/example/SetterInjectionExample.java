package com.alvinskylers.dependencyinjection.example;

public class SetterInjectionExample {

    //Required dependency
    private Dependency dependency;

    //Injecting the dependency via setter method
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
