package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
     //   Pet pet = context.getBean("myPet",Pet.class);
        //Dog dog = new Dog();
        Person person = context.getBean("myPerson",Person.class);
        person.callPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
