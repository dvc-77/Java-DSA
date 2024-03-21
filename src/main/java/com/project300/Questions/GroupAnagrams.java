package com.project300.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroup = new HashMap<>();

        for(String str: strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sortedStr = String.valueOf(temp);

            if (!anagramGroup.containsKey(sortedStr)) {
                anagramGroup.put(sortedStr, new ArrayList<>());
            }

            anagramGroup.get(sortedStr).add(str);
        }

        List<List<String>> result = new ArrayList<>(anagramGroup.values());


        return result;

    }
}
