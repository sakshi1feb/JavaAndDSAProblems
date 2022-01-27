package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q20TotalSurfaceAreaOfCube {
    // A program to calculate the total surface area of cube
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of cube");
        int side=sc.nextInt();
        int tsa=6*side*side;
        System.out.println("The Total surface area of cube is "+tsa);
    }
}
