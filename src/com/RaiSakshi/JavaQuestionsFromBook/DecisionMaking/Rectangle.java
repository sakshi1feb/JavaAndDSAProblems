package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class Rectangle {
    // A program to find area perimeter and diagonal of a rectangle
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter length of rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int b=sc.nextInt();
        int peri=2*(l+b);
        int area=l*b;
        double diagonal=Math.sqrt(Math.pow(l,2)+Math.pow(b,2));
        System.out.println("The perimeter of the rectangle is "+peri);
        System.out.println("The area of the rectangle is "+area);
        System.out.println("The diagonal of the rectangle is "+diagonal);
    }
}
