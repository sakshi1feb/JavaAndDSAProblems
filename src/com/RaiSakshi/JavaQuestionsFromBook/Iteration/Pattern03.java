package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

public class Pattern03 {
    // Pg 153 Prog 15
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-(5-i)-1;s++)
                System.out.print(i+" ");
            for (int j=i;j<=5;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
