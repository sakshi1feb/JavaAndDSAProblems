package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q25LargestUntill0 {
    // This program keeps on taking input from the user and displays the largest of all the numbers untill user inputs 0
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=0;
        System.out.println("Enter numbers and if you wish to exit input 0");
        int n=sc.nextInt();
        while(true){
            if(n==0)
                break;
            else
                l=Math.max(n,l);
            int m=sc.nextInt();
            n=m;
        }
        System.out.println("The largest of all the input numbers is "+l);
    }
}
