package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q3Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        int sum=0,avg;
        for(int i=1;i<=n;i++) {
            System.out.print("Enter value of term"+i+" : ");
            int m=sc.nextInt();
            sum+=m;
        }
        avg=sum/n;
        System.out.println("The avearage of the numbers is "+avg);
    }
}
