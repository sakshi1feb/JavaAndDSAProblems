package com.RaiSakshi;

import java.util.Scanner;

public class GreetingMessage {
    // This program is from Kunal's DSA Bootcamp
    // IN this program we have to take a name as input and print a greeting message for the name.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+". Welcome to the world of programming.");
    }
}
