package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class AreaOfRhombus {
    // A program to calculate the area of Rhombus
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two diagonals of the rhombus ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int area=a*b/2;
        System.out.println("Area of Rhombus is "+area);
    }
}
