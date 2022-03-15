package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ25  {
    //Pg 129 Q25
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu \n0. Ground Floor\n1. First Floor \n2. Second Floor\n3. Third Floor");
        System.out.println("Enter your choice of floor from the above menu");
        int ch=sc.nextInt();
        float price, devCharge;
        double td,amt=0;
        System.out.println("Enter price of the flat");
        price=sc.nextFloat();
        System.out.println("Enter development charge");
        devCharge=sc.nextFloat();
        switch (ch){
            case 0:
                td=(0.1*price)+(0.08*devCharge);
                amt=(price+devCharge) - td;
                break;
            case 1:
                td=(0.02*price)+(0.01*devCharge);
                amt=(price+devCharge) - td;
                break;
            case 2:
                td=(0.05*price)+(0.05*devCharge);
                amt=(price+devCharge) - td;
                break;
            case 3:
                td=(0.075*price)+(0.1*devCharge);
                amt=(price+devCharge) - td;
                break;
            default:
                System.out.println("Invalid floor number");
        }
        System.out.println("Amount to be paid for the floor is "+amt);
    }
}
