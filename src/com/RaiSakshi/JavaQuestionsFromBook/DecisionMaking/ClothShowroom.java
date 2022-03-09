package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ClothShowroom {
    // pg -103 prog 6
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total price of the product : ");
        int p=sc.nextInt();
        double discount;
        if(p<=2000){
            discount=0.05*p;
            System.out.println("Discount is "+discount);
            System.out.println("Assured Gift:Wall Clock");
        }else if(p>2000 && p<=5000){
            discount=0.1*p;
            System.out.println("Discount is "+discount);
            System.out.println("Assured Gift:School Bag");
        }else if(p>5000 && p<=10000){
            discount=0.15*p;
            System.out.println("Discount is "+discount);
            System.out.println("Assured Gift:Electric Iron");
        }else  if(p>10000 && p<=20000){
            discount=0.2*p;
            System.out.println("Discount is "+discount);
            System.out.println("Assured Gift:Wrist Watch");
        }

    }
}
