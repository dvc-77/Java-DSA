package com.project300.Questions;

import java.util.Arrays;

public class AE_twoNumberSum {
    class Program {
        public static int[] twoNumberSum(int[] array, int targetSum) {
            int right = array.length - 1;
            int left = 0;
            Arrays.sort(array);

            while(left < right){
                if(array[left] + array[right] == targetSum) {
                    return new int[] {array[left], array[right]};
                }else if(array[left] + array[right] < targetSum) {
                    left++;
                }else {
                    right--;
                }
            }
            return new int[0];
        }
    }

}
