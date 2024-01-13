package com.project300.Questions;

public class BubbleSort {
    class Solution {


        public int[] bubbleSort(int[] array) {
            boolean sorted = false;
            int unsortedUntilIndex = array.length;

            while(!sorted) {
                sorted = true;

                for(int i = 0; i < unsortedUntilIndex; i++){
                    if(array[i] > array[i+1]){
                        int temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                        sorted = false;
                    }
                }
                unsortedUntilIndex -= 1;
            }
            return array;
        }

    }
}
