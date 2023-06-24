package com.company;

import java.util.ArrayList;
import java.util.List;

public class CS3_448 {
    //Ask in google:
    //find all number disappeared in an array
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,5,6,6,8};
        System.out.println(findDisappearNumbers(arr));
    }

    private static List<Integer> findDisappearNumbers(int[] nums) {

    //    public List<Integer> findDisappearNumbers(int[] nums){
        int i = 0;
        while (i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else {
                    i++;
                }
        }
        //Just find missing numbers :
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                ans.add(index+1);
            }
        }
        return ans;
    }

        private static void swap(int[] arr, int first, int second) {

            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}
