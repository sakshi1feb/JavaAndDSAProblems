package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;


public class Pattern12 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int s;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                s=n-i;
                for(int sp=1;sp<=n-s;sp++)
                    System.out.print(" ");
                for(int j=1;j<=n-i+1;j++)
                    System.out.print("* ");
            }else{
                s=n-(i-n);
                for(int sp=1;sp<=s;sp++)
                    System.out.print(" ");
                for(int j=1;j<=i-n+1;j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
