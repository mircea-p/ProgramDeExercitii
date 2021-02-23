package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex1Calculator {

    public static void calculator(){

        Scanner scan = new Scanner(System.in);
        int a,b,c;
        long d,e,f;
        System.out.println("Exercitiul nr 1: ");
        System.out.println("Introduceti trei nr intergi: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        System.out.println("Introduceti trei nr de tip long: ");
        d=scan.nextLong();
        e=scan.nextLong();
        f=scan.nextLong();

        int rezult1=a-b-c;
        System.out.printf("a-b-c= %d", rezult1);
        long rezult2=d*e/f;
        System.out.printf("\nd*e/f= %d", rezult2);
    }

}
