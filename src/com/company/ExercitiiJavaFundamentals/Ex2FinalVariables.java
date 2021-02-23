package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex2FinalVariables {

    public static void finalVariables(){

        System.out.println("Exercitiul nr 2: ");

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduceti un nr de tip int: ");
        final int finalInt = scan.nextInt();

        System.out.println("Introduceti un sir de caractere: ");
        String text = scan.nextLine();
        final String finalString = text;

        System.out.println("Introduceti o valoare boleana: ");
        final boolean finalBoolean = scan.nextBoolean();

        System.out.println("Introduceti un nr de tip long: ");
        final long finalLong = scan.nextLong();

        System.out.println("Introduceti un nr de tip float: ");
        final float finalFloat = scan.nextFloat();

        System.out.println("Datele introduse sunt: ");
        System.out.println(finalInt);
        System.out.println(finalString);
        System.out.println(finalBoolean);
        System.out.println(finalLong);
        System.out.println(finalFloat);



    }
}
