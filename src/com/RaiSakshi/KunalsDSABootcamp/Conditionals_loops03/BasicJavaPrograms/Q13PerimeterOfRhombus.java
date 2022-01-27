package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q13PerimeterOfRhombus {
    // A program to calculate the perimeter of Rhombus
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side ");
        int side=sc.nextInt();
        int perimeter=4*side;
        System.out.println("The perimeter of the rhombus is "+ perimeter);
    }
}
