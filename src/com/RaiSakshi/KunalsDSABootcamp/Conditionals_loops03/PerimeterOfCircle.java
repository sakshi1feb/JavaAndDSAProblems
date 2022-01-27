package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class PerimeterOfCircle {
    // To calculate Perimeter of a circle
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle ");
        int r=sc.nextInt();
        double perimeter= 2*3.14*r;
        System.out.println("Perimeter of Circle is  "+perimeter);
    }
}
