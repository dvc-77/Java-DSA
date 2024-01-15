package com.project300.DataStructures.Array;

import java.util.*;

public class ArrayLists {


    // Insertion via Linear search
    public static ArrayList<Integer> insert(ArrayList<Integer> arr, int value) {
        int length = arr.size();

        if(value > arr.getLast()) {
            arr.add(value);
            return arr;
        }

        for(int index = 0; index < length; index++) {
            if(arr.get(index) > value) {
                arr.add(index, value);
                break;
            }

        }
        return arr;
    }

    // Insertion via binary search

    public static ArrayList<Integer> insert1(ArrayList<Integer> arr, int value) {
        int length = arr.size();

        if(value > arr.getLast()) {
            arr.add(value);
            return arr;
        }

        int left = 0;
        int right = length - 1;
        int index = 0;

        while(left <= right) {
            int midpoint = (left + right) / 2;
            index = midpoint;

            if(arr.get(midpoint) > value) {
               right = midpoint - 1;
            }else if(arr.get(midpoint) < value) {
                left = midpoint + 1;
            }
        }
//        for(int shiftIndex = length - 1; shiftIndex >= index; shiftIndex--) {
//            int temp = arr.get(shiftIndex);
//            arr.add(shiftIndex, temp);
//        }

        arr.add(index, value);


        return arr;
    }


    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(17);
        arr.add(80);
        arr.add(202);

        System.out.println(insert(arr, 75));
        System.out.println(insert1(arr, 90));

//        // Convert int[] to Integer[] using Java 8 Streams
//        Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
//
//        // Create a set from the Integer[] array
//        Set<Integer> set = new HashSet<>(Arrays.asList(integerArray));

    }
}
