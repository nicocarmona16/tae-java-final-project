package com.university.models;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<Teacher> teacherList = new ArrayList<>();
    private final List<Student> studentList = new ArrayList<>();
    private final List<UniversityClass> universityClassList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<UniversityClass> getUniversityClassList() {
        return universityClassList;
    }

    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addUniversityClass(UniversityClass universityClass) {
        this.universityClassList.add(universityClass);
    }
}
