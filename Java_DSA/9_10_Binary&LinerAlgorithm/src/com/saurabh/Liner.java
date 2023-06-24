package com.saurabh;

public class Liner {
    public static void main(String[] args) {
        int[] nums = {23 , 45 , 1 , 2 , 8 , 19 , -3 , 16 , -11 , 28 };
        int target = 45;
        int ans = LinearSearch( nums , target );
        System.out.println(ans);
    }
    // Search the element and return true or false :
    static boolean LinearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        //run for loop

        for (int element : arr) {
            if (element == target) {
                return true;
            }

        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return false ;
    }
    // Search the element and return thr target :
    static int LinearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        //run for loop

        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1 ;
    }
    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run for loop :
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index ;
            }
        }
        //run for loop
//        for (int index = 0; index < arr.length; index++) {
//            //check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target){
//                return index;
//            }
//
//        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1 ;
    }
}
