package com.saurabh;

public class LinerSearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18 , 12 , -7 , 3 , 14 , 28 };
        int target = 18 ;
        System.out.println(LinearSearch(arr , target , 0 , 4 ));
    }
    static int LinearSearch(int[] arr, int target , int start , int end ){
        if (arr.length == 0){
            return -1;
        }
        //run for loop
        for (int index = start; index <= end ; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1 ;
    }
}
