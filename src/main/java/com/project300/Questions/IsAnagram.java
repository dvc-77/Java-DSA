package com.project300.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IsAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();
            Integer c = 0;
            Arrays.sort(c1);
            Arrays.sort(c2);
            HashSet<Integer> l = new HashSet<>();
            return Arrays.equals(c1, c2);
        }
    }
}
