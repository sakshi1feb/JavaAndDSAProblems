package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class CreateNumber {
/*
    Write a program ti input three different single digit numbers between 1 and 9 (both inclusive). Display
    the greatest and smallest three digit number.
 */
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter three digits");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int g=0;
    int s=0;
    if(a>b && a>c){
        g+=a*100;
        s+=a;
        if(b>c){
            g+=(b*10)+c;
            s+=b*10+(c*100);
        }else{
            g+=(c*10)+b;
            s+=(c*10)+(b*100);
        }
    }else if(b>a && b>c){
        g+=b*100;
        s+=b;
        if(a>c) {
            g += (a * 10) + c;
            s+= (a * 10) + (c * 100);
        } else {
            g += (c * 10) + a;
            s = (c * 10) + (a * 100);
        }}else if(c>b&& c>a){
            g+=c*100;
            s+=c;
            if(b>a){
                g+=(b*10)+a;
                s+=(b*10)+(a*100);
            }else{
            g+=(a*10)+b;
            s+=(a*10)+(b*100);
        }
        }
    System.out.println("The greatest number that can be formed is "+g);
    System.out.println("The smallest number that can be formed is "+s);
}
}

