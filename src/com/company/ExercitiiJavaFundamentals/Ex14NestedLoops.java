package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex14NestedLoops {

    public static void nestedLoops(){
        System.out.println("Exercitiul nr 14: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul de randuri: ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
