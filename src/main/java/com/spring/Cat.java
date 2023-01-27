package com.spring;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("cat been is created");
    }

    @Override
    public void say(){
        System.out.println("Miu-miu");
    }
}
