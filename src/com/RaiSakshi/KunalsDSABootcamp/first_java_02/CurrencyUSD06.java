package com.RaiSakshi.KunalsDSABootcamp.first_java_02;

import java.util.Scanner;

public class CurrencyUSD06 {
    // This program is from Kunal's DSA Bootcamp
    // In this program we have to take input currency in Rs and convert it in USD
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter currency in Rupees: ");
        double rs=sc.nextInt();
        System.out.println("Currency in USD is : "+(rs*74.50));
    }
}
