package com.project300.Questions;

import java.util.Arrays;

import static com.project300.Questions.SelectionSort.Solution.selectionSort;

public class SelectionSort {
    class Solution {
        public static int[] selectionSort(int[] array) {
            boolean sorted = false;

            int increaseIndex = 0;

            while(!sorted) {
                sorted = true;
                int lowest = increaseIndex;
                for(int index = increaseIndex; index < array.length; index++) {
                    lowest = (array[index] < array[lowest]) ? index: lowest;
                    sorted = false;
                }
                if(!sorted) {
                    int temp = array[increaseIndex];
                    array[increaseIndex] = array[lowest];
                    array[lowest] = temp;
                    increaseIndex++;
                }
            }
            return array;
        }


    }

    public static void main(String[] args) {
        int[] array = {4,2,7,1,3,8,0};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
