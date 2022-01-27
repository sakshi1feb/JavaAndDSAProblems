package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class SumUntill0 {
    // This program takes input from the user and prints the sum of the the numbers untill the user input's 0
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int sum=0;
        while (n!=0){
                sum+=n;
                int m=sc.nextInt();
                n=m;
        }
        System.out.println("The sum of all the input numbers is "+sum);
    }
}
