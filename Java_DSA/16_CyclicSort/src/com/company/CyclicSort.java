package com.company;

import java.util.Arrays;

public class CyclicSort {
    //when given nos. from range 1 to N = use Cyclic Sort :- imp problem
    /* arr = { 3 , 5, 2 ,1 ,4 }
       After sorting arr = {1,2,3,4,5}
     */
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void sort(int[] arr){
        int i = 0;
             while (i < arr.length){
                    int correct = arr[i] - 1;
                    if (arr[i] != arr[correct]){
                        swap(arr,i,correct);
                    }else {
                        i++;
                    }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
