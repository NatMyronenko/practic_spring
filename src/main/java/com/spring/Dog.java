package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class Dog implements Pet {
    private String name;

    @Override
    public void say() {
        System.out.println("Gav -Gav");
    }

    public Dog() {
        System.out.println("dog bean is created");
    }


//    protected void init() {
  //      System.out.println("class dog : init method");
 //   }


//    private void destroy() {
//        System.out.println("class dog : destroy method");
//    }
}
