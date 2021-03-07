package com.company.ExercitiiJavaFundamentals.Ex23Company;

public class Employee {

    private String firstName;
    private String lastName;
    private byte age;

    public Employee(String fn, String ln, byte age){
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
    }

    public byte getAge() {
        return this.age;
    }

    public String toString(){
       return firstName + " " + lastName + " " + age + " ani.";
    }

}
