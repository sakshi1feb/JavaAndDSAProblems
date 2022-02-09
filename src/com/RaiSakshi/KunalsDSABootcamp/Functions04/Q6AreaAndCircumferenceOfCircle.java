package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q6AreaAndCircumferenceOfCircle {
    // A program using functions to calculate area and circumference of circle
    static double  PI=3.14;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double r=sc.nextDouble();
        double a=area(r);
        double peri=circumference(r);
        System.out.println("Area of the circle ia "+a);
        System.out.println("Perimeter of the circle is "+peri);
    }

    static double circumference(double r) {
        return PI*2*r;
    }
    static double area(double r){
        return PI*r*r;
    }
}
