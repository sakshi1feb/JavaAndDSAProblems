package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Discount {
    /*
        A computer manufacturing company announces a special offer to their customer on purchasing Laptops
        and printers accordingly:
        On Laptops: Discount=15%
        On Printers: Discount=10%
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of laptop: ");
        int lp=sc.nextInt();
        double dlp= 0.15*lp;
        System.out.println("Enter price of printer: ");
        int pp=sc.nextInt();
        double dpp=0.01*pp;
        System.out.println("Discount on Laptop: "+dlp);
        System.out.println("Discount on Printer: "+dpp);
    }
}
