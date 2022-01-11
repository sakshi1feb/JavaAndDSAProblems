package com.RaiSakshi;

import java.util.Scanner;

public class AreaOfRectangle {
    //This program is from code studio
    // In this program we have to take input and calculate the area of rectangle
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle ");
        int l=sc.nextInt();
        System.out.print("Enter breadth of rectangle ");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area of rectangle is = "+area);
    }
}
