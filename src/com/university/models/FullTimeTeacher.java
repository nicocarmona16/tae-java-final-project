package com.university.models;

public class FullTimeTeacher extends Teacher{
    private final int experienceYears;
    private static final double MULTIPLIER = 1.10;

    public FullTimeTeacher(int id, String name, double baseSalary, int experienceYears) {
        super(id, name, baseSalary);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * (MULTIPLIER * experienceYears);
    }
}
