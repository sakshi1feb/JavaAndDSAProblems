package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q17VolumeOfSphere {
    // A program to calculate volume of sphere
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of sphere ");
        double r=sc.nextDouble();
        double volume =4*3.14*r*r*r/3;
        System.out.println("Volume of Sphere is "+volume);
    }
}
