package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

public class Pattern34 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row=69;row>=65;row--){
            for(int col=row;col>=65;col--)
                System.out.print((char)col+" ");
            System.out.println();
        }
    }
}
