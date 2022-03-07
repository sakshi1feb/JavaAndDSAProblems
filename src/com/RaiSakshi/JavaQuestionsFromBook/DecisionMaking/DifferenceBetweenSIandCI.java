package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DifferenceBetweenSIandCI {
    // A program to find the difference between Simple Interest and Compound Interest
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter principal value: ");
        int p=sc.nextInt();
        System.out.println("Enter rate of interest: ");
        double r=sc.nextInt();
        System.out.println("Enter time period: ");
        int t=sc.nextInt();
        r=r/100;
        double si=p*r*t;
       // System.out.println("si"+si);
        double a=p*Math.pow((1+r), t);
        double ci=a-p;
       // System.out.println("ci"+ ci);
        double diff=Math.abs(si-ci);
        System.out.println("Difference between Simple Interest and Compound Interest is: "+((int)diff));
    }
}
