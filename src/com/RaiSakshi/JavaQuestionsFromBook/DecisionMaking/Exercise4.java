package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ts=3000;
        int nv=10;
        float div=0.1f;
        int andiv=2000;
        double noshar=(2000)/(nv*div);
        System.out.println("The current number of shares he has is "+(int) noshar);
        System.out.println("The remaining number of shares he needs to buy is "+(int) (ts-noshar));
    }
}
