package com.company.ExercitiiJavaFundamentals;


import java.util.Scanner;

public class Ex15OneDimentionalTable {

    public static void oneDimentionalTable(){

        System.out.println("Exercitiul nr 15: ");
        String[] tabel = new String[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti 5 nume: ");

        for (int i=0;i<tabel.length;i++){
            System.out.print(i+1 + ": ");
            tabel[i]=scan.nextLine();
        }

        for (int i=0;i<tabel.length;i++){
            System.out.println("Hello " + tabel[i] + "!");
        }

    }

}
