package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ27 {
    // Pg 129 Q27
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.nextLine();
        System.out.println("Enter address ");
        String address = sc.nextLine();
        System.out.println("Enter type of purchase as 'L' for laptops and 'D' for desktops ");
        char category = sc.next().trim().charAt(0);
        System.out.println("Enter amount of purchase ");
        int amt = sc.nextInt();
        double toPay=0;
        if (category == 'L') {
            if(amt<=25000)
            {
                toPay =amt;
                System.out.println("Amount to be paid is "+toPay);
            }else if(amt>25000 && amt<=57000)
            {
                toPay =amt-(0.05*amt);
                System.out.println("Amount to be paid is "+toPay);
            }else if(amt>57000 && amt<=100000)
            {
                toPay =amt-(0.075*amt);
                System.out.println("Amount to be paid is "+toPay);
            }else {
                toPay=amt-(0.1*amt);
                System.out.println("Amount to be paid is "+toPay);
            }
        } else if (category == 'D') {
            if(amt<=25000)
            {
                toPay =amt-(0.05*amt);
                System.out.println("Amount to be paid is "+toPay);
            }else if(amt>25000 && amt<=57000)
            {
                toPay =amt-(0.075*amt);
                System.out.println("Amount to be paid is "+toPay);
            }else if(amt>57000 && amt<=100000)
            {
                toPay =amt-(0.1*amt);
                System.out.println("Amount to be paid is "+toPay);
            }else {
                toPay=amt-(0.15*amt);
                System.out.println("Amount to be paid is "+toPay);
            }
        }else
            System.out.println("Wrong Category");
    }
}
