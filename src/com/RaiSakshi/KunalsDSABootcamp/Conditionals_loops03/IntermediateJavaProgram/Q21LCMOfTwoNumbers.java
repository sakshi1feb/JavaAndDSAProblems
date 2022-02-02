package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q21LCMOfTwoNumbers {
    // A program to calculate LCM of two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm=(a>b?a:b);
        while(true){
            if(lcm%a==0 && lcm%b==0) {
                System.out.println("The LCM of two numbers is " + lcm);
                break;
            }else{
                lcm++;
            }
        }
    }
}
