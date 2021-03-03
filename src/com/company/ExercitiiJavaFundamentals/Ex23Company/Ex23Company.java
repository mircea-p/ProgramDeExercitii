package com.company.ExercitiiJavaFundamentals.Ex23Company;

public class Ex23Company {

    public static void companyTest(){

        Employee[] em = new Employee[2];
        Company c = new Company("SC Strut SRL");
        for(int i = 0; i < 2; i++){
            em[i] = c.setemployees();
        }
        String text;
        for( int i = 0; i < 2; i++){
            text = em[i].toString();
            System.out.println(text);
        }
       System.out.println("Varsta medie a angajatilor este: " + c.getAverageAge());
    }
}
