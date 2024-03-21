package com.project300.data_structures.array;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        DynamicList<String> myList = new DynamicList<>();

        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 2");
        myList.add("Item 3");


        myList.add(1, "Inserted Item");
        myList.remove(1);
        myList.trimToSize();

        System.out.println("List size: " + myList.size());


        System.out.println("List after inserting at index 1: " + myList);

//        System.out.println("Item at index 3: " + myList.get(16));
    }
}
