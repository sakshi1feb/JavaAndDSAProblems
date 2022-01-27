package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

// A program to calculate the volume of prism
public class Q15VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of prism");
        int l=sc.nextInt();
        System.out.println("Enter base of prism");
        int b=sc.nextInt();
        System.out.println("Enter height of prism");
        int h=sc.nextInt();
        int volume =l*b*h/2;
        System.out.println("Volume of prism is "+volume);
    }
}
