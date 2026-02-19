package com.alvinskylers.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private HardDisk hardDisk;

    @Autowired
    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public HardDisk getHardDisk() {
        return this.hardDisk;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "hardDisk=" + hardDisk +
                '}';
    }
}
