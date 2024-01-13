package com.project300.Questions;

public class MaxProduct {
    class Solution {
        public int maxProduct(int[] nums) {
            int maxVal = 0;
            int secondMaxVal = 0;

            for(int val: nums) {
                if(val > maxVal) {
                    secondMaxVal = maxVal;
                    maxVal = val;
                }else if(val > secondMaxVal) {
                    secondMaxVal = val;
                }
            }

            return (secondMaxVal-1)*(maxVal-1);
        }
    }
}
