package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class VolumeOfPyramid {
    // A program to calculate the volume of pyramid
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the base of the pyramid");
        int l=sc.nextInt();
        System.out.println("Enter width of the base of the pyramid");
        int w=sc.nextInt();
        System.out.println("Enter height of the pyramid");
        int h=sc.nextInt();
        int volume= l*w*h/3;
        System.out.println("The volume of pyramid is "+volume);
    }
}
