package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q7AreaOfEquilateralTriangle {
    // A program to calculate area of Equilateral Triangle
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of the equilateral triangle ");
        int a=sc.nextInt();
        double area = Math.sqrt(3)*Math.pow(a,2)/4;
        System.out.println("Area of Equilateral Triangle is "+area);

    }
}
