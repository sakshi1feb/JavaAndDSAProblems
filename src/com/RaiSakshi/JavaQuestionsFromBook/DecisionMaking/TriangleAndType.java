package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class TriangleAndType {
    /*
    A program to input three sides of a triangle and check if a triangle is possible or not. If possible, then
    display if is an equilateral, an Iso-sceles or a Scalene Triangle otherwise, display "Triangle is not
    possible"
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>=c&&a+c>=b&& b+c>=a){
            System.out.print("Triangle is possible ");
            if(a==b&&b==c&a==c)
                System.out.println(" and it is an equilateral triangle ");
            else if(a==b|| b==c|| a==c)
                System.out.println(" and it is an isosceles triangle.");
            else
                System.out.println(" and it is a scalene triangle.");
        }else{
            System.out.println("Triangle is not possible ");
        }
    }
}
