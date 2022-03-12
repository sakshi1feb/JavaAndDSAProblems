package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ10 {
    // Pg 125 Q10
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two digit number ");
        int n=sc.nextInt();
        int s=0,p=1,r=1;
        int m=n;
        while(n>0){
            r=n%10;
            s+=r;
            p*=r;
            n=n/10;
        }
        int sd=s+p;
        if(sd==m)
            System.out.println("Special 2- digit number");
        else
            System.out.println("Not a special two digit number");
    }
}
