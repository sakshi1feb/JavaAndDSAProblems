package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ComplementaryAndSuplementaryAngles {
    // Pg 113 Prog-2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two angles: ");
        float angle1=sc.nextFloat();
        float angle2=sc.nextFloat();
        float m=(float) Math.toRadians(angle1);
        float n= (float) Math.toRadians(angle2);
        if(angle1+angle2==90){
            System.out.println("The angles are complementary");
            System.out.println("The sin value of "+angle1+" is "+Math.sin(m));
            System.out.println("The sin value of "+angle2+" is "+Math.sin(n));
        }else if(angle1+angle2==180){
            System.out.println("The angles are supplementary");
            System.out.println("The cosine value of "+angle1+" is "+Math.cos(m));
            System.out.println("The cosine value of "+angle2+" is "+Math.cos(n));
        }else {
            System.out.println("The angles are neither complementary nor supplementary");
        }
    }
}
