package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloApp helloApp = context.getBean("helloApp", HelloApp.class);
        helloApp.sayHello();
    }
}
