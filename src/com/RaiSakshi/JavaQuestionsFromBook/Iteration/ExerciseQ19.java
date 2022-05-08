package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

public class ExerciseQ19 {
    public static void main(String[] args) {
        pattern1();
        pattern2();
    }

     static void pattern2() {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }

    static  void pattern1() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                if(j%2==0)
                    System.out.print("# ");
                else
                    System.out.print("* ");
            System.out.println();
        }
    }
}
