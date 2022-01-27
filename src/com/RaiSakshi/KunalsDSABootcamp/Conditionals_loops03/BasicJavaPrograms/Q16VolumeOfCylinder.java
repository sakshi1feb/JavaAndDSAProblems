package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q16VolumeOfCylinder {
    // A program to calculate volume of a cylinder
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of cylinder");
        double r=sc.nextDouble();
        System.out.println("Enter height of cylinder ");
        int h=sc.nextInt();
        double volume= 3.14*r*r*h;
        System.out.println("Volume of Cylinder is "+volume);

    }
}
