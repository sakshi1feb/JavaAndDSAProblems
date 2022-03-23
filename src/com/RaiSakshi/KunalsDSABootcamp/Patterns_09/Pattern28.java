package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

public class Pattern28 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int sp=1;sp<=n-i;sp++)
                    System.out.print(" ");
                for (int j=1;j<=i;j++)
                    System.out.print("* ");
            }else{
                int s=n-(i-n);
                for(int sp=1;sp<=n-s;sp++)
                    System.out.print(" ");
                for(int j=1;j<=n-(i-n);j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
