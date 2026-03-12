package com.university.models;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {
    private String name;
    private String classroom;
    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    public UniversityClass(String name, String classroom, Teacher teacher, List<Student> studentList) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public String getClassroom() {
        return classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent (Student student) {
        this.studentList.add(student);
    }
}
