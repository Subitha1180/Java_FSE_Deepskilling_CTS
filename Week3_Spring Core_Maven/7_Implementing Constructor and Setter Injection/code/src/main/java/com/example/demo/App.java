package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentServiceConstructor constructorService = context.getBean(StudentServiceConstructor.class);
        constructorService.showStudentDetails();

        StudentServiceSetter setterService = context.getBean(StudentServiceSetter.class);
        setterService.showStudentDetails();
    }
}