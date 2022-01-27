package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

// Program to calculate the area of triangle

public class AreaOfTriangle02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of triangle ");
        int b=sc.nextInt();
        System.out.println("Enter height of triangle ");
        int h=sc.nextInt();
        double area =b*h*0.5;
        System.out.println("The area of the triangle is "+area);
    }
}
