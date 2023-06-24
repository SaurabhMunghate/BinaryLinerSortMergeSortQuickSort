package com.company;

import java.util.Arrays;

public class BSQ4_34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

//    private static int searchRange(int[] arr) {
//    }

    static int[] searchRange(int[] nums , int target) {

        int[] ans = {-1, -1};

        // check for first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    //this function just return ths index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
    int ans = -1 ;
    int start = 0;
    int end = nums.length - 1;

        while(start <= end ){
            //find the middle element
            // int mid = (start + end )/2  //might be possible that (start + end ) exceeds the range of int in java
            int mid = start + (end - start)/2;

            if (target < nums[mid]){
                end = mid -1 ;
            }else if (target > nums[mid]){
                start = mid + 1 ;
            }else {
                //potential asn found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
