package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q5AreaOfParallelogram {
    // to calculate area of parallelogram

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of parallelogram");
        int b=sc.nextInt();
        System.out.println("Enter height of parallelogram");
        int h=sc.nextInt();
        int area=b*h;
        System.out.println("Area of parallelogram is "+area);
    }
}
