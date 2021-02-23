package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex6StringCompare {

    public static void stringCompare(){

        System.out.println("Exercitiul nr 6: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dou siruri de caractere: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        boolean egale;
        egale = str1.equals(str2);
        System.out.println("Cele doua siruri sunt egale: " + egale);
    }
}
