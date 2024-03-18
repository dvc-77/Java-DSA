package com.project300.data_structures.array;

import java.util.Arrays;
import java.util.Objects;

public class DynamicList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    public DynamicList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity();

        // Shift elements to make room for the new one
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }

        // Insert the new element
        elements[index] = element;

        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public int size() {
        return size;
    }



    public static void main(String[] args) {
        DynamicList<String> myList = new DynamicList<>();

        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        System.out.println("List size: " + myList.size());

        myList.add(1, "Inserted Item");
        System.out.println("List after inserting at index 1: " + Arrays.toString(myList.elements));

        System.out.println("Item at index 2: " + myList.get(2));
    }
}
