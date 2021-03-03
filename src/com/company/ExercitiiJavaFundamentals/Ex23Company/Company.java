package com.company.ExercitiiJavaFundamentals.Ex23Company;

import java.util.Scanner;

public class Company {

    private String cname;
    public Employee[] employees = new Employee[5];

    public Company(String cname){

        this.cname = cname;
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
    public byte getAverageAge(){
        byte sum = 0;
        for( int i = 0; i <= this.employees.length; i++){
            sum += employees[i].getAge();
        }
        return (byte) ((byte) sum/this.employees.length);
    }
}
