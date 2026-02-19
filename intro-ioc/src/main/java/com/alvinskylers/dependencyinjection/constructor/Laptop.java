package com.alvinskylers.dependencyinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public HardDrive ssd;

    @Autowired
    public Laptop(HardDrive ssd) {

        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                ", ssd=" + ssd +
                '}';
    }
}
