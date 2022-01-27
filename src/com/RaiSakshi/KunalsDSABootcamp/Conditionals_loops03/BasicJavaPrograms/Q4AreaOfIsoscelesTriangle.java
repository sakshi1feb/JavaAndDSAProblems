package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q4AreaOfIsoscelesTriangle {

    // A program to calculate area of Isosceles Triangle

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the triangle which are same ");
        int a=sc.nextInt();
        System.out.println("Enter the other side of the triangle ");
        int b=sc.nextInt();
        double area= b/2*Math.sqrt((a*a)- (b*b/4));
        System.out.println("Area of the isosceles triangle is "+area);
    }
}
