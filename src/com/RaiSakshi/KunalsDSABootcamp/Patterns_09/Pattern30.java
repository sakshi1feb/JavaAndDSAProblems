package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

public class Pattern30 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int sp=1;sp<=5-i;sp++)
                System.out.print("  ");
            for(int j=i;j>=1;j--)
                System.out.print(j+"  ");
            for(int c=2;c<=i;c++)
                System.out.print(c+"  ");
            System.out.println();
        }
    }
}
