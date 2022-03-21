package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class Toss {
    /*
    In a game of tossing a coin, you want to know the number of times you get 'Head' and 'Tail' respectively.
    You keep the record as '1' for getting 'Head' and '0' for getting a tail. Write a program to perform the above task.
    Suppose you have tossed a coin for 20 times in this game.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sh=0,st=0;
        System.out.println("Enter value obtained in toss as '1' for head and 't' for tail.");
        for(int i=1;i<=20;i++){
            int val=sc.nextInt();
            if(val==0)
                st++;
            if(val==1)
                sh++;
        }
        System.out.println("The number of heads obtained is "+sh);
        System.out.println("The number of tails obtained is "+st);
    }
}
