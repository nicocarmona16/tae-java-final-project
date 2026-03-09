package com.university.models;

public class FullTimeTeacher extends Teacher{
    private int experienceYears;

    public FullTimeTeacher(int id, String name, double baseSalary, int experienceYears) {
        super(id, name, baseSalary);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * (1.10 * experienceYears);
    }
}
