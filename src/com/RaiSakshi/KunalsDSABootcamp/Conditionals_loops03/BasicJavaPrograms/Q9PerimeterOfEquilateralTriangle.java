package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q9PerimeterOfEquilateralTriangle {
    // a program to calculate the area of an equilateral triangle

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of triangle ");
        int a=sc.nextInt();
        double area= Math.pow(a,3);
        System.out.println("Area of an Equilateral Triangle is "+ area);
    }
}
