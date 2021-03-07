package com.company.ExercitiiJavaFundamentals.Ex23Company;

import java.util.Scanner;

public class Ex23Company {

    public static void companyTest(){

//        System.out.println("Dati nr de angajati: ");
//        Scanner scan = new Scanner(System.in);
//        int nrAng = scan.nextInt();
        Company c = new Company("SC Strut SRL",3);
        for(int i = 0; i < 3; i++){
            c.employees[i] = Company.setemployees();
        }
        String text;
        for( int i = 0; i < 3; i++){
            text = c.employees[i].toString();
            System.out.println(text);
        }
        System.out.println( c.toString());
       System.out.println("Varsta medie a angajatilor este: " + c.getAverageAge());
    }
}
