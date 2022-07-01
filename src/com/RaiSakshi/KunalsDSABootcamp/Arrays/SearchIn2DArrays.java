package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},
            {5,6,7,8},
            {12,123,234,54,-9},
            {14,123,89}
        };
        int target=-9;
       int[] ans= search(arr,target);
        System.out.println("Position of the array element is "+Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        if (arr.length==0)
            return new int[]{0,0};
        else{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++)
                    if(arr[i][j]==target)
                        return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
}
