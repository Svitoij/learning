package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        String firstName = "Olek";
        String lastName = "Sandr";


        Period difference = Period.between(LocalDate.of(2000, 8, 12), LocalDate.now());
        int age = difference.getYears();
        System.out.println(firstName + " " + lastName + " ти шо дЕбіл? Тобі " + age);
    }
}