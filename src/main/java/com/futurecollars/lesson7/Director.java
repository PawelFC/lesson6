package com.futurecollars.lesson7;

import java.util.Arrays;

public class Director extends Manager {

    private Car companyCar;

    public Director(String firstName, String lastName, double salary, Employee[] subordinates, Car car) {
        super(firstName, lastName, salary, subordinates);
        this.companyCar = car;
    }

    @Override
    public String toString() {
        return "Director{" +
                "companyCar=" + companyCar +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", subordinates=" + Arrays.toString(subordinates) +
                '}';
    }

    @Override
    public String getJobTitle() {
        return "Director";
    }
}
