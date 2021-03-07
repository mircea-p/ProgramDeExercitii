package com.company.ExercitiiJavaFundamentals.Ex23Company;

import java.util.Arrays;
import java.util.Scanner;

public class Company {

    private String cname;
    public int nrAngajati;
    public Employee[] employees = new Employee[3];

    public Company(String cname, int nrAng){

        this.cname = cname;
        this.nrAngajati = nrAng;
    }
    public static Employee setemployees(){
        Scanner scan = new Scanner(System.in);
        String fname, lname;
        byte age;
        System.out.println("Introduceti datele angajatului: ");
        System.out.print("Nume: ");
        lname = scan.nextLine();
        System.out.print("Prenumeume: ");
        fname = scan.nextLine();
        System.out.print("Varsta: ");
        age = scan.nextByte();
        Employee e1 = new Employee(fname, lname, age);
        return e1;
    }
    public int getAverageAge(){
       int sum = 0;
        for( int i = 0; i < employees.length; i++){
            sum += employees[i].getAge();
        }
        return  sum/employees.length;
    }
    public String toString(){
        return cname + " " + " " + Arrays.toString(employees);
    }
}
