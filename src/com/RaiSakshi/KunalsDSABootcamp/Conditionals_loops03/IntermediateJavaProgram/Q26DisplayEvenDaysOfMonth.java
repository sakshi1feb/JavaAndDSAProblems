package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q26DisplayEvenDaysOfMonth {
    /*
    Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to
    count the number of days he can go out in the month of August.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=31;//Number of days in the month of August
        System.out.println("The dates of the month August when kunal can go out with his friends are:  ");
        for (int i = 02; i <=31 ; i=i+2) {
            System.out.print(i+", ");
        }
    }
}
