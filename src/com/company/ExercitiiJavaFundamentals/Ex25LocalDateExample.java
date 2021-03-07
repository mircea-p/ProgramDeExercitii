package com.company.ExercitiiJavaFundamentals;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Ex25LocalDateExample {

    public static void localDateExample(){

        System.out.println("Exercitiul 25:");
       // Scanner scan = new Scanner(System.in);
        LocalDate t1 = LocalDate.of(2021,01,10);
        LocalDate acum =LocalDate.now();
        if(t1.isAfter(acum))
            System.out.println("Data: " + t1 + " este  dupa " + acum);
        else if(t1.isBefore(acum))
            System.out.println("Data: " + t1 + " este  inainte de " + acum);
    }
}
