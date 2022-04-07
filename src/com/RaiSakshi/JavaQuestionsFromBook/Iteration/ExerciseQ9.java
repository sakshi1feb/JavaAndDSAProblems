package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

public class ExerciseQ9 {
    public static void main(String[] args) {
        int a=10, b=99;
        int first, last;
        for(int i=a;i<=b;i++){
            first= i/10;
            last = i%10;
            if(last== 2*first)
                System.out.println(i);
        }
    }
}
