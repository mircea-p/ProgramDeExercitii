package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class ExecutaExercitiiJavaFundamentals {

    public static void startExercitii(){

        int alegere=1;

        do {
        System.out.print("Alegeti exercitiul pe care doriti sa-l rulati, tastand un nr de la 1 la 23: ");

        Scanner scan = new Scanner(System.in);
        int nrEx=scan.nextInt();
            switch (nrEx) {
                case 1:
                    Ex1Calculator.calculator();
                    break;
                case 2:
                    Ex2FinalVariables.finalVariables();
                    break;
                case 3:
                    Ex3BooleanExpressions.booleanExpressions();
                    break;
                case 4:
                    Ex4CastExample.castExample();
                    break;
                case 5:
                    Ex5StringConcatenation.stringConcatenation();
                    break;
                case 6:
                    Ex6StringCompare.stringCompare();
                    break;
                case 14:
                    Ex14NestedLoops.nestedLoops();
                    break;
                case 15:
                    Ex15OneDimentionalTable.oneDimentionalTable();
                    break;
                case 17:
                    Ex17MatrixExample.matrixExample();
                    break;
                case 21:
                    Ex21GetDistinct.getDistinct();
                    break;
                default:
                    System.out.println("Exercitiul acesta nu a fost rezolvat inca!");
            }

            System.out.print("\nDaca mai doriti sa rulati un alt exercitiu tasatati: 1 daca nu tastati orice nr: = ");
            alegere = scan.nextInt();

        }while (alegere==1);


    }
}
