package com.university.services;

import com.university.models.*;
import com.university.utils.DataInitializer;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {
    private University university;

    public UniversityService() {
        this.university = DataInitializer.initializeData();
    }

    public List<Teacher> getAllTeachers() {
        return university.getTeacherList();
    }

    public List<UniversityClass> getAllClasses() {
        return university.getUniversityClassList();
    }

    public void addStudentToClass(Student student, UniversityClass universityClass) {
        university.addStudent(student);
        universityClass.addStudent(student);
    }

    public void addClass(UniversityClass universityClass) {
        university.addUniversityClass(universityClass);
    }

    public List<Student> getAllStudents() {
        return university.getStudentList();
    }

    public List<UniversityClass> getClassesByStudentId(int studentId) {
        List<UniversityClass> studentClasses = new ArrayList<>();
        for (UniversityClass universityClass : university.getUniversityClassList()) {
            for (Student student : universityClass.getStudentList()) {
                if (student.getId() == studentId) {
                    studentClasses.add(universityClass);
                    break;
                }
            }
        }
        return studentClasses;
    }

    public Student getStudentById(int id) {
        for (Student student : university.getStudentList()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Teacher getTeacherById(int id) {
        for (Teacher teacher : university.getTeacherList()) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }
}
