package com.university.view;

import com.university.models.*;
import com.university.services.UniversityService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private UniversityService universityService;

    public Menu(UniversityService universityService) {
        this.universityService = universityService;
    }

    public void printMenu() {
        boolean isActive = true;

        while (isActive) {
            System.out.println("\n*** UNIVERSITY TRACKING SYSTEM ***");
            System.out.println("a. Print all the professors with its data");
            System.out.println("b. Print all the classes and a submenu to select a class in order to print the class data including its teacher and students");
            System.out.println("c. Create a new student and add it to an existing class");
            System.out.println("d. Create a new class and add an existing teacher, existing students and its relevant data");
            System.out.println("e. List all the classes in which a given student is included");
            System.out.println("f. Exit");
            System.out.print("Select an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "a":
                    printAllTeachers();
                    break;
                case "b":
                    printAllClassesAndSubmenu();
                    break;
                case "c":
                    createNewStudent();
                    break;
                case "f":
                    isActive = false;
                    System.out.println("Finishing process");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void createNewStudent() {
        System.out.println("\n *** Create new student ***");
        System.out.print("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(id, name, age);

        System.out.println("\n*** Select a class to enroll the student ***");
        printClassList();
        System.out.print("Enter the class number: ");
        int correctIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        List<UniversityClass> universityClasses = universityService.getAllClasses();
        if (correctIndex >= 0 && correctIndex < universityClasses.size()) {
            UniversityClass selectedClass = universityClasses.get(correctIndex);

            universityService.addStudentToClass(student, selectedClass);
            System.out.println(student.getName() + " was added to " + selectedClass.getName());
        } else {
            System.out.println("Invalid class.");
        }
    }

    private void printClassList() {
        List<UniversityClass> universityClasses = universityService.getAllClasses();
        for (int i = 0; i < universityClasses.size(); i++) {
            System.out.println((i + 1) + ". Class name: " + universityClasses.get(i).getName() + " - Classroom: " + universityClasses.get(i).getClassroom());
        }
    }

    private void printAllClassesAndSubmenu() {
        System.out.println("*** List of Classes ***");
        printClassList();
        List<UniversityClass> universityClasses = universityService.getAllClasses();

        System.out.print("Enter the number of the class to see details: ");
        int inputClass = scanner.nextInt();
        int correctIndex = inputClass - 1;

        if (correctIndex >= 0 && correctIndex < universityClasses.size()) {
            UniversityClass selectedClass = universityClasses.get(correctIndex);
            System.out.println("\n*** Class Details *** ");
            System.out.println("Class name: " + selectedClass.getName());
            System.out.println("Classroom: " + selectedClass.getClassroom());
            System.out.println("Teacher: " + selectedClass.getTeacher().getName());
            System.out.println("Students:");
            for (Student student : selectedClass.getStudentList()) {
                System.out.println("- " + student.getName() + " - ID: " + student.getId() + " - Age: " + student.getAge());
            }
        } else {
            System.out.println("Invalid option");
        }
        scanner.nextLine();
    }

    private void printAllTeachers() {
        System.out.println("*** List of Teachers ***");
        for (Teacher teacher : universityService.getAllTeachers()) {
            System.out.println("ID: " + teacher.getId() + " - Name: " + teacher.getName() + " - Base Salary: " + teacher.getBaseSalary() + " - Calculated Salary: " + teacher.calculateSalary());
            if (teacher instanceof FullTimeTeacher) {
                FullTimeTeacher fullTimeTeacher = (FullTimeTeacher) teacher;
                System.out.println("Type: Full Time (Experience: " + fullTimeTeacher.getExperienceYears() + " years)");
            } else if (teacher instanceof PartTimeTeacher) {
                PartTimeTeacher partTimeTeacher = (PartTimeTeacher) teacher;
                System.out.println("Type: Part Time (Active hours per week: " + partTimeTeacher.getHoursPerWeek());
            }
            System.out.println("************************************************************************************************************");
        }
    }

}
