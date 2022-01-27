package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q22SumProduct {
    // A program to calculate the difference between the sum and product of the digits of the number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,sum=0,product=1,diff;
        while(n>0){
            r=n%10;
            sum+=r;
            product*=r;
            n=n/10;
        }
        diff = Math.abs(sum-product);
        System.out.println("The difference between the sum and product of the digits of the number is "+diff);
    }
}
