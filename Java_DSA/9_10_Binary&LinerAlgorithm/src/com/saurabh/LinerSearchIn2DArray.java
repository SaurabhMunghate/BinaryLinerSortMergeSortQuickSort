package com.saurabh;

import java.util.Arrays;

public class LinerSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23 , 4 ,1 },
                {18 , 12 , 3 , 9 },
                {78 , 99 , 34 , 56 },
                {18 , 12 }
        };
        int target = 23 ;
        int[] ans = search(arr , target); // format of return value {roe , col }
        System.out.println(Arrays.toString(ans));
        // run for maximum arr :
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE); // range of minimum number
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{ row , col };
                }
            }
        }
        return new int[]{-1 , -1 };
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr [row][col];
                }
            }
        }
        return max;
    }
}
