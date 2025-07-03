package com.example.demo;

public class StudentServiceSetter {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void showStudentDetails() {
        System.out.println("Setter Injection: " + student.getDetails());
    }
}