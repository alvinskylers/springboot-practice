package com.alvinskylers.dependencyinjection.constructor;

public class HardDrive {

    public String type;
    public int capacity;

    public HardDrive(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
