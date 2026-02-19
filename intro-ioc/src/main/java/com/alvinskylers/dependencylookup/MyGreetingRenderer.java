package com.alvinskylers.dependencylookup;

public class MyGreetingRenderer implements GreetingRenderer{

    private GreetingProvider greetingProvider;

    @Override
    public void render() {
        if (greetingProvider == null) {
            throw new RuntimeException(
                    "You must set the property greetingProvider of a class: "
                    + MyGreetingRenderer.class.getName()
            );
        }
        System.out.println(greetingProvider.getGreeting());
    }

    @Override
    public void setGreetingProvider(GreetingProvider provider) {
        this.greetingProvider = provider;
    }

    @Override
    public GreetingProvider getGreetingProvider() {
        return this.greetingProvider;
    }
}
