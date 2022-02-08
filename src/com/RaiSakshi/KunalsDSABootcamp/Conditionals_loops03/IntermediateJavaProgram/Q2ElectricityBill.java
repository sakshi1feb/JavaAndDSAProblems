package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q2ElectricityBill {
    // A program to calculate the electricity bill
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units of electricity consumed ");
        double unit=sc.nextDouble();
        System.out.println("Enter rate of electricty per unit");
        double rate=sc.nextDouble();
        double bill=unit*rate;
        System.out.println("The calculated electricity bill is "+bill);
    }
}
