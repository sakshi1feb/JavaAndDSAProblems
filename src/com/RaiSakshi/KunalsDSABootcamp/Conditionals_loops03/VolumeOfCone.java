package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

// A program to calculate the volume of a cone
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of cone ");
        double r=sc.nextDouble();
        System.out.println("Enter height of cone ");
        int h=sc.nextInt();
        double volume =3.14*r*r*h/3;
        System.out.println("The volume of cube is "+volume);
    }
}
