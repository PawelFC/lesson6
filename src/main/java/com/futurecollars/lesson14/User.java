package com.futurecollars.lesson14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public User(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getAge() {
        Period age = Period.between(birthDate, LocalDate.now());
        return "User is " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days.";
    }
}
