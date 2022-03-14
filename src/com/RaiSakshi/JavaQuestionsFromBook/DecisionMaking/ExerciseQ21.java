package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ21 {
    // Pg 128 Q21
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1.c --> circle\n2.s --> square\n3.r -->rectangle");
        System.out.println("Enter your choice of figure whose area you want to calculate ");
        char ch=sc.next().trim().charAt(0);
        switch (ch){
            case 'c':
                System.out.println("Enter radius of circle ");
                float r=sc.nextFloat();
                System.out.println("Area of circle is "+(2*3.14*r*r));
                break;
            case 's':
                System.out.println("Enter side of square");
                float side =sc.nextFloat();
                System.out.println("Area of square is "+(side*side));
                break;
            case 'r':
                System.out.println("Enter length of the rectangle ");
                float l=sc.nextFloat();
                System.out.println("Enter breadth of the rectangle ");
                float b=sc.nextFloat();
                System.out.println("Area of rectangle is "+(l*b));
                break;
            default:
                System.out.println("Wrong choice of character");
        }
    }
}
