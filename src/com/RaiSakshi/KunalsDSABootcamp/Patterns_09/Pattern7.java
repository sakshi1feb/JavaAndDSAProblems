package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int sp =1;sp<n;sp++)
                System.out.print("  ");
            for(int j=1;j<=n-i+1;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
