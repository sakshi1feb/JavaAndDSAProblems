package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ7 {
    // pg 125 Q7
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the three angles of the triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        if(sum==180){
            System.out.println("Triangle is possible");
            if(a==90|| b==90|| c==90)
                System.out.println("Right Angled Triangle");
            if(a>90||b>90||c>90)
                System.out.println("obtused Angled Triangle");
            if(a<90 && b<90 && c<90)
                System.out.println("Acute angled Triangle");
        }else{
            System.out.println("Triangle not possible");
        }
    }
}
