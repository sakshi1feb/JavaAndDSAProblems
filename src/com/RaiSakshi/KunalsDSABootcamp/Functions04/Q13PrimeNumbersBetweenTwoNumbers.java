package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

import static com.RaiSakshi.KunalsDSABootcamp.Functions04.Q7PrimeNumber.prime;

public class Q13PrimeNumbersBetweenTwoNumbers {
    // A program to find prime numbers between two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers one as starting point and another as ending point");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The prime numbers between the range is ");
        for (int i = a; i <= b; i++){
            boolean check=prime(i);
            if(check==true)
                System.out.print(i+"\t");
        }
    }

    static boolean prime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
             return    false;
        }
        return true;
    }
}

