package com.project300.data_structures.array;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        DynamicList<Integer> myList = new DynamicList<>();

        Random random = new Random();
        random.setSeed(13);
        int numElements = 23;

        for (int i = 0; i < numElements; i++) {
            int randomInt = random.nextInt(100);
            myList.add(randomInt);
        }

        myList.remove(1);

//        myList.trimToSize();

        System.out.println("List after inserting at index 1: " + myList);

//        System.out.println("Item at index 3: " + myList.get(16));
    }
}
