package com.company.ExercitiiJavaFundamentals;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public static int getArea(int a, int b){
        return a*b;
    }
    public static int getPerimeter(int a, int b){
        return 2*a+2*b;
    }
}
