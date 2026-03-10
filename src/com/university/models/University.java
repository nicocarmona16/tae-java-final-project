package com.university.models;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();
    private List<UniversityClass> universityClassList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<UniversityClass> getUniversityClassList() {
        return universityClassList;
    }

    public void setUniversityClassList(List<UniversityClass> universityClassList) {
        this.universityClassList = universityClassList;
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
