package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ23 {
    // Pg 128 Q23
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1.Volume of cube\n2.Volume of sphere\n3.Volume of cuboid");
        System.out.println("Enter your choice from the above menu");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter side of cube ");
                float side=sc.nextFloat();
                System.out.println("Volume of the cube is "+(side*side*side));
                break;
            case 2:
                System.out.println("Enter radius of sphere ");
                float r=sc.nextFloat();
                System.out.println("Volume of sphere is "+((4*3.14*r*r*r)/3));
                break;
            case 3:
                System.out.println("Enter length of cuboid");
                float l=sc.nextFloat();
                System.out.println("Enter breadth of cuboid");
                float b=sc.nextFloat();
                System.out.println("Enter height of cuboid ");
                float h=sc.nextFloat();
                System.out.println("Volume of cuboid "+(l*b*h));
            default:
                System.out.println("Invalid choice");
        }

    }
}
