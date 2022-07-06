package com.futurecollars.lesson07;

import java.util.Arrays;

public class Manager extends Employee {
    //DRY
    // Don't repeat yourself

    protected Employee[] subordinates;

    public Manager(String firstName, String lastName, double salary, Employee[] subordinates) {
        super(firstName, lastName, salary);
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", subordinates=" + Arrays.toString(subordinates) +
                '}';
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }
}
