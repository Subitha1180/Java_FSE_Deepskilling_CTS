package com.example.demo;

public class Student {
    private String name;
    private int id;

    public Student() {}

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getDetails() {
        return "Student Name: " + name + ", ID: " + id;
    }
}