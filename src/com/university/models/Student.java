package com.university.models;

public class Student extends Person{
    private final int age;

    public Student(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
