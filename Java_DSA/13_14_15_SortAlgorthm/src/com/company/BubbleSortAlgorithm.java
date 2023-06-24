package com.company;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    // Bubble sort also known as sinking sort and exchange sort
    // space complexity = 0(1) // constant // no extra space required i.e. coping thr array not required
    // also in place sorting algorithm
    // as the size growing , the no.of comparison is also growing
    // when j never swaps for a value of i , it means array is sorted hence we can end the program
    // worst case if we gate descending order arr

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr ){
        boolean swapped;
        //run thr steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step , max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j - 1 ]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the loop
            if(!swapped){ // false = true
                break;
            }
        }
    }
}
