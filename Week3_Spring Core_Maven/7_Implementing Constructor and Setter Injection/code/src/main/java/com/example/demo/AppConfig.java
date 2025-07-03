package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student1() {
        return new Student("Subitha", 1001);
    }

    @Bean
    public Student student2() {
        return new Student("Arjun", 1002);
    }

    @Bean
    public StudentServiceConstructor constructorService() {
        return new StudentServiceConstructor(student1());
    }

    @Bean
    public StudentServiceSetter setterService() {
        StudentServiceSetter service = new StudentServiceSetter();
        service.setStudent(student2());
        return service;
    }
}