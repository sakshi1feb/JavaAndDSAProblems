package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ElectricityBoard {
    // Pg 101 prog 4
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units of electricity  consumed: ");
        float unit=sc.nextFloat();
        double pay=0.0;
        if(unit<=100){
            pay= unit*5.50;
        }else if(unit>100 && unit<=300) {
            pay=(100*5.50)+(unit-100)*6.50;
        }else if(unit>300 && unit<=600){
            pay=(100*5.50)+(200*6.50)+(unit-300)*7.50;
        }else{
            pay=(100*5.50)+(200*6.50)+(300*7.50)+(unit-600)*8.50;
        }
        System.out.println("Amount to be paid is "+pay);
    }
}
