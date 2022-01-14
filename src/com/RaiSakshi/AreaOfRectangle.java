package com.RaiSakshi;

import java.util.Scanner;

public class AreaOfRectangle {
    // This program is from Code Studio
    //This program is to calculate the area of rectangle
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle ");
        int L=sc.nextInt();
        System.out.print("Enter breadth of rectangle ");
        int B=sc.nextInt();
        int area=L*B;
        System.out.println("The area of rectangle is = "+area +" units.");
    }
}
