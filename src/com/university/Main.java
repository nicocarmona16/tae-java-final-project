package com.university;

import com.university.services.UniversityService;
import com.university.view.Menu;

public class Main {
    public static void main(String[] args) {
        UniversityService universityService = new UniversityService();
        Menu menu = new Menu(universityService);
        menu.printMenu();
    }
}