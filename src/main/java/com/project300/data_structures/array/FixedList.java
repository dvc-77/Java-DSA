package com.project300.data_structures.array;

import java.util.Arrays;

public class FixedList <T> {
    private T[] data;
    private static final int DEFAULT_CAPACITY = 10;
    private int index;
    private int size;

    public FixedList() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        this.index = 0;
    }

    public FixedList(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.index = 0;
    }

    private boolean checkIndexOutOfBound(int index) {
        if (index < 0 || index >= DEFAULT_CAPACITY) {
            throw new IndexOutOfBoundsException("Illegal Index: " + index);
        }

        return false;

    }

    public void add(T element) {
        checkIndexOutOfBound(index);
        data[index++] = element;
        size++;
    }

    public void add(T element, int index) {
        checkIndexOutOfBound(index);
        int lastIndex = data.length - 1;

        if(data[index] != null && data[lastIndex] != null) {
            throw new IllegalStateException("List is full. No more room for insertion at an occupied index");
        }else if(data[index] != null && data[lastIndex] == null) {
            System.arraycopy(data, index, data, index + 1, lastIndex - index);
        }

        if(data[index] == null){
           int checkIndex = 0;
           while(checkIndex < size()) {
               if(data[checkIndex] == null) {
                   index = checkIndex;
                   break;
               }
               checkIndex++;
           }
        }

        data[index] = element;
        size++;
    }

    public int size()  {
        return data.length;
    }

    public T get(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + data.length);
        }
        if(data[index] == null) {
            throw new NullPointerException("No value at Index");
        }
        return (T) data[index];
    }

    public String toString() {
        Arrays.stream(data).forEach(value -> System.out.print(value + ", "));
        return "\n";
    }

    public boolean isEmpty() {
        return (data[0] == null);
    }

    public T remove(int index) {
        get(index);

        T value = data[index];

        if (!isEmpty()) {
            int lastIndex = data.length - 1;
            System.arraycopy(data, index + 1, data, index, lastIndex - index);
            data[lastIndex] = null;
        }

        size--;
        return value;
    }

    public static void main(String[] args) {
        FixedList<Integer> list = new FixedList<>();

//        list.add(1, 5);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);

        System.out.println(list.remove(2));

//        list.add(11, 2);

        System.out.println(list);

    }

}
