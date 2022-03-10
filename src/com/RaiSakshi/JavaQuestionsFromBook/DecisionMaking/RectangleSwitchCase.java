package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class RectangleSwitchCase {
    // Pg 111 Prog 1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tMenu\n1.Area\n2.Perimeter\n3.Diagonal");
        System.out.println("Enter your choice from the above menu as it's index number.");
        int ch=sc.nextInt();
        System.out.println("Enter length of rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectancle: ");
        int b=sc.nextInt();
        switch(ch){
            case 1:{
                // for area
                float area=l*b;
                System.out.println("Area of the rectangle is "+area);
            }break;
            case 2:{
                // for perimeter
                float perimeter=2*(l+b);
                System.out.println("The perimeter of ther rectangle is "+perimeter);
            }break;
            case 3:{
                // for diagonal
                float diagonal= (float) Math.sqrt((Math.pow(l,2)+Math.pow(b,2)));
                System.out.println("The diagonal of the rectangle is "+diagonal);
            }
        }
    }
}
