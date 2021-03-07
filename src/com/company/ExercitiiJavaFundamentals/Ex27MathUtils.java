package com.company.ExercitiiJavaFundamentals;

public class Ex27MathUtils {

    public static void mathUtils(){

        System.out.println("Exercitiul 27:");
        System.out.println(power(2,3));
        System.out.println(factorial(4));
    }
    public static double power(int a, int b){
        return Math.pow(a,b);
    }
    public static double factorial(int n){
        double x = 1;
        for (int i = 1; i <= n; i++)
            x *= i;
        if(n <= 0)
            return 0;
        else
            return x;
    }
}
