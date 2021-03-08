package com.company.ExercitiiJavaFundamentals;

import java.util.Scanner;

public class Ex21GetDistinct {

       public static void getDistinct(){
           System.out.println("Exercitiul nr 21: ");

           Scanner scan = new Scanner(System.in);
           System.out.println("Introduceti lungimea sirului: ");
           int n = scan.nextInt();
           String[] sir = new String[n];
           Scanner sc2 = new Scanner(System.in);

           System.out.println("Itroduceti datele sirului de tip String:");
           for(int i = 1; i <= n; i++){
               System.out.print(i +". ");
               sir[i-1] = sc2.nextLine();
           }
           int eg=0;
           String[] unic = new String[n];
           int k=0;
           for(int i = 0; i < n; i++ ) {
               eg=0;
               for (int j = 0; j < n; j++)
                   if (sir[i].equals(sir[j])) {
                       eg++;
                   }
               if (eg == 1) {
                   unic[k] = sir[i];
                   k++;
               }
           }
           System.out.println("Elementele unice ale sirului sunt: ");
           for(int i = 0;i < k; i++)
               System.out.println(unic[i]);
       }


}
