package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

// A program to calculate area of Circle
public class Q1AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle  ");
        float r=sc.nextFloat();
       double area= 3.14*Math.pow(r,2);
        System.out.println("Area of the Circle is "+area);
    }
}
