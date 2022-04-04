package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1. To check a composite number\n2.To find the smallest digit of an integer");
        System.out.println("Enter your choice");
        char ch=sc.next().trim().charAt(0);
        switch (ch){
            case '1':
                System.out.println("Enter a number to check if it is composite or not ");
                int n=sc.nextInt();
                int c=0;
                for(int i=1;i<n/2;i++){
                    if(n%i==0)
                        c++;
                }
                if(c==1)
                    System.out.println("Not a composite number");
                else
                    System.out.println("Composite number");

                break;
            case '2':
                System.out.println("Enter an integer ");
                int m=sc.nextInt();
                int r=0,s=9;
                while(m>0){
                    r=m%10;
                    if(r<=s)
                        s=r;
                    m=m/10;
                }
                System.out.println("The smallest digit of the integer is "+s);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
