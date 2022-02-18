package com.RaiSakshi.LeetCodeProblems.Arrays.Easy;
 /*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
     customer has in the  bank. Return the wealth that the richest customer has.A customer's wealth is the
      amount of money they have in all their bank accounts. The richest customer is the customer that has the
       maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
  */

import java.util.Scanner;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum=0;int max=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max)
                max=sum;
            sum=0;
        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of people");
        int l=sc.nextInt();
        int [][] accounts= new int[l][l];
        for(int i=0;i<accounts.length;i++){
            System.out.println("Enter account value");
            for(int j=0;j<l;j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        System.out.println("The maximum wealth is "+ maximumWealth(accounts));
    }
}

