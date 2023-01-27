package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
       // person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        Pet cat2 = context.getBean("catBean",Pet.class);
 //       person.callPet();
     //   Person person2 = context.getBean("personBean", Person.class);
    ///    person2.callPet();
     //   System.o
        //   ut.println(person==person2);

        context.close();
    }
}
