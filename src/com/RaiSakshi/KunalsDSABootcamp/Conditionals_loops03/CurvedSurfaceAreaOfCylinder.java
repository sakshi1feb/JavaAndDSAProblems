package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    // A program to calculate the curved surface area of cylinder
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of cylinder");
        double r=sc.nextDouble();
        System.out.println("Enter height of cylinder");
        int h=sc.nextInt();
        double csa=2*3.14*r*h;
        System.out.println("The curved surface area of the cylinder is "+csa);
    }
}
