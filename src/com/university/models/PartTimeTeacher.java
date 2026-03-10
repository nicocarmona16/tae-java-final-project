package com.university.models;

public class PartTimeTeacher extends Teacher{
    private int hoursPerWeek;

    public PartTimeTeacher(int id, String name, double baseSalary, int hoursPerWeek) {
        super(id, name, baseSalary);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursPerWeek;
    }
}
