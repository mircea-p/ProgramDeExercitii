package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex5StringConcatenation {

    public static void stringConcatenation(){

        System.out.println("Exercitiul nr 5: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti trei siruri de caractere: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();

        String sum = str1+str2+str3;
        System.out.println("Concatenarea celor trei siruri cu + este: " + sum);

       // String sum2 = String.join(str1,str2,str3);
        String sum2 =str1.concat(str2).concat(str3);
        System.out.println("Concatenarea celor trei siruri cu o metoda este: " + sum);


    }
}
