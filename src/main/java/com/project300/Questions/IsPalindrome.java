package com.project300.Questions;

public class IsPalindrome {
    class Solution {
        // Time complexity: O(N)
//        public boolean isPalindrome(String s) {
//            s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//            int end = s.length() - 1;
//
//            for(int start = 0; start < s.length()/2; start++){
//                if(s.charAt(start) != s.charAt(end)){
//                    return false;
//                }
//                end--;
//            }
//            return true;
//        }
        public boolean isPalindrome(String s){
            s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            int start = 0;
            int end  = s.length() - 1;
            while(start <= end) {
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

    }
}
