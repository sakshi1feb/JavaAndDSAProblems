package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program to initialize the 'Seven Wonders' of the World along with their locations in two different
arrays.Search for a name of the country input by the users. If found, display the country along with it's Wonder,
otherwise display 'Sorry Not Found!'
 */
public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] sevenWonders=new String[7];
        String [] country=new String[7];
        int val=-1;
        System.out.println("Enter the seven Wonders of the world :-");
        for(int i=0;i<sevenWonders.length;i++)
            sevenWonders[i]=sc.nextLine();
        System.out.println("Enter the country in which the seven wonder is found respectively:-");
        for(int i=0;i<country.length;i++)
            country[i]=sc.nextLine();

        System.out.println("Input Country Name to search the wonder");
        String input=sc.nextLine();
        for(int i=0;i<country.length;i++) {
            if (country[i].equals(input))
                val = i;
        }
        if(val!=-1)
                System.out.println("The seven wonder in  "+input+" country is "+sevenWonders[val]);
            else
                System.out.println("Sorry Not Found!");
        }
    }

