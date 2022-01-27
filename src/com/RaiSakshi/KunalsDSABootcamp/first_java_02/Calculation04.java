package com.RaiSakshi.KunalsDSABootcamp.first_java_02;

import java.util.Scanner;

public class Calculation04 {
// This program is from Kunal's DSA Bootcamp
// In this program we input two numbers and an operator and perform calculation
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number = ");
    int a=sc.nextInt();
    System.out.println("Enter second number = ");
    int b=sc.nextInt();
    System.out.println("Enter your choice of operator as '+' '-' '*' '/'");
    char operator=sc.next().trim().charAt(0);
    if(operator== '+')
        System.out.println("The sum of the two numbers is "+(a+b));
    if (operator== '-')
        System.out.println("The difference of the two numbers is "+(Math.abs(a-b)));
    if(operator == '*')
        System.out.println("The product of the two numbers is "+ (a*b));
    if (operator == '/')
        System.out.println("The quotient obtained when one no. is divided by the other is "+(a/b));
}
}
