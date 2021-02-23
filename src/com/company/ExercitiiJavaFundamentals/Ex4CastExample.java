package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex4CastExample {

    public static void castExample(){
        System.out.println("Exercitiul nr 4: ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti doua nr de tip int: ");
        int intVar1 = scan.nextInt();
        int intVar2 = scan.nextInt();

        short shortSum = (short)(intVar1+intVar2);
        System.out.println("Suma celor doua nr de tip int, cast-enite la tip short este: " + shortSum);
        System.out.println("shortSum++ = " + shortSum++);

        byte byteSum = (byte)(intVar1+intVar2);
        System.out.println("Suma celor doua nr de tip int, cast-enite la tip short este: " + byteSum);
        System.out.println("++shortSum = " + ++byteSum);

    }
}
