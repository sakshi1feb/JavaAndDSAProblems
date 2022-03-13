package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class Exercise20 {
    // Pg 128 Q20
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n 1. convert from FAHRENHEIT to CELSIUS \n 2. covert from CELSIUS to FAHRENHEIT");
        System.out.println("Enter your choice from the above menu");
        int ch = sc.nextInt();
        System.out.println("Enter temperature ");
        float temp = sc.nextFloat();
        double ntemp = 0;
        switch (ch) {
            case 1:
                ntemp = 5 * (temp - 32) / 9;
                System.out.println("The temperature in Celsius is " + ntemp);
                break;
            case 2:
                ntemp = (1.8 * temp) + 32;
                System.out.println("The temperature in Fahrenheit is " + ntemp);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}

