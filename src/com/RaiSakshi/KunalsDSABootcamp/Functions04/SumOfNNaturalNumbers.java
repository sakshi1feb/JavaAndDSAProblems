package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        System.out.println("The sum of "+n+" numbers is "+add(n));
    }

    static int add(int n) {
        int sum=0;
        for (int i = 1; i <n ; i++) {
            sum=i+sum;
        }
        return sum;
    }
}
