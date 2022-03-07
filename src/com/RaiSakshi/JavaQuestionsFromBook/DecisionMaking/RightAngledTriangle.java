package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter perpendicular of the triangle");
        int p=sc.nextInt();
        System.out.println("Enter base of the triangle ");
        int b=sc.nextInt();
        double h=Math.sqrt((Math.pow(p,2))+Math.pow(b,2));
        double area =0.5*b*h;
        double peri=p+b+h;
        System.out.println("Hypotenuse of the triangle is "+h);
        System.out.println("Area of the triangle is "+area);
        System.out.println("Perimeter of the triangle is "+peri);
    }
}
