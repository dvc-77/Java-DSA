package com.project300.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 5, 7, 4, 8, 3, 6, 1, 2 };
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void mergeSort(int[] A) {
        int length = A.length;
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = A[i];
        }
        for (int j = mid; j < length; j++) {
            right[j - mid] = A[j];
        }
        mergeSort(left);
        mergeSort(right);
        merge(A, left, right);
    }

    static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            array[k] = right[j];
            k++;
            j++;
        }
    }

}
