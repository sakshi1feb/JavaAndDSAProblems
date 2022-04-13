package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int sn=0,spo=0,spe=0;
        while (n!=0){
            if(n<0)
                sn+=n;
            else{
                if(n%2==0)
                    spe+=n;
                else
                    spo+=n;
            }
            n=sc.nextInt();
        }
        System.out.println("The sum of all negative numbers is "+sn);
        System.out.println("The sum of all positive odd number is "+spo);
        System.out.println("The sum of all negative even  number is "+spe);
    }
}
