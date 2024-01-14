package com.project300.DataStructures.Array;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        // Convert int[] to Integer[] using Java 8 Streams
        Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);

        // Create a set from the Integer[] array
        Set<Integer> set = new HashSet<>(Arrays.asList(integerArray));

    }
}
