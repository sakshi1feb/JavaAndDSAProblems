package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q10PerimeterOfParallelogram {
    // A program to calculate the perimeter of a a Parallelogram
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two non parallel sides of a parallelogram");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=2*(l+b);
        System.out.println("Area of the parallelogram is "+area);
    }
}
