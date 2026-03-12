package com.university.models;

public class PartTimeTeacher extends Teacher{
    private final int hoursPerWeek;

    public PartTimeTeacher(int id, String name, double baseSalary, int hoursPerWeek) {
        super(id, name, baseSalary);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursPerWeek;
    }
}
