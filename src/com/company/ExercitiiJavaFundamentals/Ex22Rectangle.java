package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex22Rectangle {


    public static void rectangle(){

        System.out.println("Exercitiul nr 22: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("Dati prima latura a dreptunghiului: ");
        int a = scan.nextInt();

        System.out.print("Dati a doua latura a dreptunghiului: ");
        int b = scan.nextInt();

        Rectangle x = new Rectangle(3,2);

        System.out.println("Aria dreptunghiului este: " + x.getArea(a,b) + " mp");
        System.out.println("Perimetrul dreptunghiului este: " + x.getPerimeter(a,b) + " m");




    }
}
