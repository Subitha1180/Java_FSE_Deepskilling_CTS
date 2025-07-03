package com.example.demo;

public class StudentServiceConstructor {
    private Student student;

    public StudentServiceConstructor(Student student) {
        this.student = student;
    }

    public void showStudentDetails() {
        System.out.println("Constructor Injection: " + student.getDetails());
    }
}