package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program to accept 10 states and 10 capitals of a country in two different Single Dimensional Arrays(SDA)
Now enter a state of the country to display it's capital. If it is present then display it's capital otherwise,
display a relevent message.
 */
public class StatesAndCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] states=new String[10];
        String[] capital=new String[10];
        int val=-1;
        for(int i=0;i<10;i++){
            System.out.println("Enter state");
            states[i]=sc.nextLine();
            System.out.println("Enter capital");
            capital[i]=sc.nextLine();
        }
        System.out.println("Enter the state whose capital is to be searched");
        String state=sc.nextLine();
        for(int i=0;i<states.length;i++){
            if(state.equals(states[i]))
                val=i;
        }
        if(val!=-1)
            System.out.println("The capital is :"+capital[val]);
        else
            System.out.println("Sorry the state you entered is not found in the database.");
    }
}
