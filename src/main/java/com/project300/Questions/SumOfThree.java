package com.project300.Questions;

public class SumOfThree {
    class Solution {
        public long[] sumOfThree(long num) {
            if (num % 3 == 0) {
                long x = num / 3;
                return new long[] {x - 1, x, x + 1};
            }
            return new long[] {};
        }
    }
}
