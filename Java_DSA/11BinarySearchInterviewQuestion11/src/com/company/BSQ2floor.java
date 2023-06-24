package com.company;

public class BSQ2floor {
   /* Q2
    Find the floor of a number  :---
    floor = the greatest number smaller or = target
            arr = { 2 , 3, 5, 9 , 14 , 16 ,18 }
    floor of = 15   ( ans = 14 )
            */
    public static void main(String[] args) {
        int[] arr = {2 , 3 , 5 , 9 , 14 , 16 ,18 };
        int target = 15 ;
        int ans = ceiling(arr , target);
        System.out.println(ans);
    }
    // return the index of smalled no <= target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end ){
            //find the middle element
            // int mid = (start + end )/2  //might be possible that (start + end ) exceeds the range of int in java
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1 ;
            }else if (target > arr[mid]){
                start = mid + 1 ;
            }else {
                //and found
                return mid ;
            }
        }
        return end;
    }
}
