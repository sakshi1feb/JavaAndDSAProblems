package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q8Grades {
    /*
        Write a program that will ask the user to enter his/her marks (out of 100). Define a method
         that will display grades according to the marks entered as below:


                Marks        Grade
                91-100         AA
                81-90          AB
                71-80          BB
                61-70          BC
                51-60          CD
                41-50          DD
                <=40          Fail
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks out of 100 ");
        float marks=sc.nextInt();
        System.out.println(" your grade is "+grade(marks));
    }

     static String grade(float marks) {
        if(marks>=91 && marks<=100)
            return "AA";
        if(marks>=81 && marks<=90)
            return "AB";
        if(marks>=71&& marks<=80)
            return "BB";
        if(marks>=61 && marks<=70)
            return "BC";
        if(marks>=51&& marks<=60)
            return  "CD";
        if (marks>41&& marks<=50)
            return "DD";
        else
            return  "Fail";
        }
    }

