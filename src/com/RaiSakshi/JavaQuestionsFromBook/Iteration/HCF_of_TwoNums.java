package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class HCF_of_TwoNums {
    // A program to input two numbers and find their HCF
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find HCF");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(hcf(a,b));
    }
    static String hcf(int a, int b){
        if(a==1||b==1)
            return"HCF of the two numbers is 1";
        int p=a*b;
        int hcf=0;
        for(int i=1;i<=p;i++){
            if(a%i==0&& b%i==0)
                hcf=i;
        }
        return ("HCF of the two numbers is "+hcf);
    }
}
