package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int m=sc.nextInt();
        int r=0,d=0;
        for(int i=1;i<=9;i++){
            int count =0;
            int n=m;
            while(n>0){
                r=n%10;
                if(r==i)
                    count++;
                n=n/10;
            }
            if(count>1) {
                d++;
                break;
            }
        }
        if(d>=1)
            System.out.println("Not a unique number ");
        else if(d==0)
            System.out.println("A unique number");
    }
}
