package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class employee {
    /*
    Write a class with name employee and basic as its data member.Find the gross pay of an employee for
    the following allowances and deduction. Use meaningful variables:
    Dearness Allowance=25% of Basic Pay
    House Rent Allowance=15% fo Basic Pay
    Net Pay=Basic Pay+Dearness Allowance+House Rent Allowance
    Gross Pay=Net Pay-Provident Fund
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Basic Pay: ");
        int bp=sc.nextInt();
        double da=0.25*bp;
        double hra=0.15*bp;
        double pf=0.0833*bp;
        double netpay=bp+da+hra;
        double grosspay=netpay-pf;
        System.out.println("The gross pay of the employeee is "+grosspay);
    }
}
