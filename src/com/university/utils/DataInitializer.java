package com.university.utils;

import com.university.models.*;

import java.util.ArrayList;
import java.util.Arrays;

public class DataInitializer {

    public static University initializeData() {
        University university = new University();

        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher(1000000000, "Full Time Teacher 1", 6000000, 8);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher(1000000001, "Full Time Teacher 2", 4500000, 4);
        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher(1000000002, "Part Time Teacher 1", 100000, 6);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher(1000000003, "Part Time Teacher 2", 85000, 10);

        university.addTeacher(fullTimeTeacher1);
        university.addTeacher(fullTimeTeacher2);
        university.addTeacher(partTimeTeacher1);
        university.addTeacher(partTimeTeacher2);

        Student student1 = new Student(1000000004, "Student 1", 19);
        Student student2 = new Student(1000000005, "Student 2", 23);
        Student student3 = new Student(1000000006, "Student 3", 21);
        Student student4 = new Student(1000000007, "Student 4", 19);
        Student student5 = new Student(1000000008, "Student 5", 22);
        Student student6 = new Student(1000000009, "Student 6", 22);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);

        UniversityClass universityClass1 = new UniversityClass("Class 1", "19210", fullTimeTeacher1, new ArrayList<>(Arrays.asList(student1, student2)));
        UniversityClass universityClass2 = new UniversityClass("Class 2", "19306", fullTimeTeacher2, new ArrayList<>(Arrays.asList(student3, student4, student1)));
        UniversityClass universityClass3 = new UniversityClass("Class 3", "19208", partTimeTeacher1, new ArrayList<>(Arrays.asList(student5, student6, student3)));
        UniversityClass universityClass4 = new UniversityClass("Class 4", "21310", partTimeTeacher2, new ArrayList<>(Arrays.asList(student1, student2, student4, student5, student6)));

        university.addUniversityClass(universityClass1);
        university.addUniversityClass(universityClass2);
        university.addUniversityClass(universityClass3);
        university.addUniversityClass(universityClass4);

        return university;
    }
}
