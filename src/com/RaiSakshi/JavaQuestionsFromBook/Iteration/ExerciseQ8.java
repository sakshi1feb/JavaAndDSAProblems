package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,product=1;
        while(n>0){
            r=n%10;
            if(r%2==0)
                product *=(++r);
            n=n/10;
        }
        System.out.println("Product of the successor of the even digits of the number is "+product);
    }
}
