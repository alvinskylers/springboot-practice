package com.alvinskylers.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    public final SampleClass sampleClass;

    @Autowired
    public Service(SampleClass sampleClass) {
        this.sampleClass = sampleClass;
    }


}
