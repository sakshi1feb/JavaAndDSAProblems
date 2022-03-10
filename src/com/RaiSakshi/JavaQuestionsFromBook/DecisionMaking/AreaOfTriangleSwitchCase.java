package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class AreaOfTriangleSwitchCase {
    // Pg 114 Prog 3
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tMenu\n1. Equilateral Triangle\n2. Isosceles Triangle\n3. Scalene Triangle");
        System.out.println("Enter your choice from the above menu as per the index number");
        int ch=sc.nextInt();
        double area;
        switch(ch) {
            case 1: {
                // for equilateral triangle
                System.out.println("Enter the side of the triangle: ");
                int s = sc.nextInt();
                area = Math.sqrt(3) * Math.pow(s, 2) / 4;
                System.out.println("Area of the equilaral triangle is " + area);
            }
            break;
            case 2: {
                // for Isosceles triangle
                System.out.println("Enter the two sides of the triangle");
                int a = sc.nextInt();
                int b = sc.nextInt();
                area = (b * Math.sqrt(4 * (a * a) - (b * b)) / 4);
                System.out.println("Area of the Isosceles triangle is " + area);
            }
            break;
            case 3: {
                //for scalene triangle
                System.out.println("Enter the three angles of the triangle: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Area of the Scalene Triangle is " + area);
            }
            break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
