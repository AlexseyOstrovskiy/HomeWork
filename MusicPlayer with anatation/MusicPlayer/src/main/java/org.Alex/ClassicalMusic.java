package org.Alex;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Start init");
    }
@PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroy");
    }
    @Override
    public String getSong() {
        return "Some CLASSIC song";
    }
}
