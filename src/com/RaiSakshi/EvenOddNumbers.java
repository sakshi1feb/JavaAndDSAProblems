package com.RaiSakshi;

import java.util.Scanner;

public class EvenOddNumbers {
    // This program is from Kunal Kushwahas DSA bootcamp of Community classroom
    //In this program we have to input a number and check whether it is even or odd.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println(n+" is an even number.");
        else
            System.out.println(n+" is an odd number.");
    }
}
