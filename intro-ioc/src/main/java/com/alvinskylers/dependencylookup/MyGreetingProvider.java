package com.alvinskylers.dependencylookup;

public class MyGreetingProvider implements GreetingProvider{
    @Override
    public String getGreeting() {
        return "Hello from GreetingProvider bean!";
    }
}
