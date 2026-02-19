package com.alvinskylers.dependencylookup;

public interface GreetingRenderer {

    void render();

    void setGreetingProvider(GreetingProvider provider);

    GreetingProvider getGreetingProvider();
}
