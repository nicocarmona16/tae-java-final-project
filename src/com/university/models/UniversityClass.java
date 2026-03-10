package com.university.models;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {
    private String name;
    private String classroom;
    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    public UniversityClass(String name, String classroom, Teacher teacher, List<Student> studentList) { // Constructor inicializado con todos los estudiantes
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public UniversityClass(String name, String classroom, Teacher teacher) { // Constructor inicializado sin estudiantes, afgregar uno a uno
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    // Este es un metodo adicinal para agregar de a un estudiante
    public void addStudent (Student student) {
        this.studentList.add(student);
    }
}
