package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class PerimeterOfSquare {
    // A program to calculate the perimeter of square
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of a square");
        int s=sc.nextInt();
        int perimeter=4*s;
        System.out.println("Perimeter of the Square is "+perimeter);
    }
}
