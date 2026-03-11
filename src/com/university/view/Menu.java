package com.university.view;

import com.university.models.FullTimeTeacher;
import com.university.models.PartTimeTeacher;
import com.university.models.Teacher;
import com.university.services.UniversityService;

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
            System.out.println("f. Exit");
            System.out.print("Select an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "a":
                    printAllTeachers();
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
