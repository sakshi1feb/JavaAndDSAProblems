package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q11PerimeterOfRectangle {
    // A program to calculate the perimeter of rectangle
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle ");
        int b=sc.nextInt();
        int area =2*(l+b);
        System.out.println("Area of rectangle is "+area);
    }
}
