package com.project300.Questions;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            if(nums.length == 0){
                return 0;
            }


            Set<Integer> values = new HashSet<>();
            int count = 0;
            int longestSequence = 0;

            for(int num: nums) {
                values.add(num);
            }

            for(int num: values) {
                if(!values.contains(num - 1)) {
                    int temp = num;
                    int sequence = 1;
                    while(values.contains(temp + 1)){
                        sequence++;
                        temp++;
                    }
                    longestSequence = Math.max(longestSequence, sequence);
                }
            }

            return longestSequence;
        }
    }
}
