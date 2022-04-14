package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,sum=0,product=1;
        while (n>0){
            r=n%10;
            sum+=r;
            product*=r;
            n=n/10;
        }
        if(sum==product)
            System.out.println("It is a sum product number ");
        else
            System.out.println("It is not a sum product number ");
    }
}
