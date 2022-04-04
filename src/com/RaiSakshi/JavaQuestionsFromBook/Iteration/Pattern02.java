package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

public class Pattern02 {
    // Pg 152 Prog 13
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=n;j++)
                System.out.print(j+" ");
            n=n-2;
            System.out.println();
        }
    }
}
