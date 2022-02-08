package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q5DistanceBetweenTwoPoints {
    // A program to calculate the distance between two points
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial point location");
        int initialLocation=sc.nextInt();
        System.out.println("Enter final point location ");
        int finalLocation=sc.nextInt();
        int distance=finalLocation - initialLocation;
        System.out.println("Distance between the two points is "+distance);
    }
}
