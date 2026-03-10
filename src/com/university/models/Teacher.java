package com.university.models;

import com.university.interfaces.SalaryCalculator;

public abstract class Teacher extends Person implements SalaryCalculator {
    protected double baseSalary;

    public Teacher(int id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public abstract double calculateSalary();
}
