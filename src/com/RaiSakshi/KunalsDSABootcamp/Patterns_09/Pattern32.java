package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

public class Pattern32 {
    public static void main(String[] args) {
        pattern();
    }

    static void pattern() {
        for(int i=69;i>=65;i--){
            for(int j=i;j<=69;j++)
                System.out.print((char)j+" ");
            System.out.println();
        }
    }

}
