package com.company;

public class BSQ3_744_Ceiling {
    /*
    1. Exact same approach for ceiling of no.
    2. Ignore the target = what are arr looking for case
    3. arr = [ 'c' , 'd' , 'f' , 'j' ] , target = 'j' ans = 'c'

     */
    public static void main(String[] args) {
        char[] letters = {'a','b','c','d'};
        char target = 'b' ;
        char ans = (char) ceiling(letters , target);
        System.out.println(ans);
    }
    // return the index of smalled no >= target
    static int ceiling(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            //find the middle element
            // int mid = (start + end )/2  //might be possible that (start + end ) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
