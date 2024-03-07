package com.project300.data_structures.array;
public class FixedSizeLinkedList {
    public class Node {
        public int data;
        public int next;

        public Node(int data, int next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node[] array;
    private int head;
    private int size;
    private int capacity;

    public FixedSizeLinkedList(int capacity) {
        this.array = new Node[capacity];
        this.size = 0;
        this.head = -1;
        this.capacity = capacity;

        for (int i = 0; i < capacity; i++) {
            array[i] = new Node(0, i + 1);
        }
        array[capacity - 1].next = -1;
    }

    public void add(int data) {
        if (size == capacity) {
            throw new IllegalStateException("Linked list is full");
        }

        int nodeIndex = size;
        array[nodeIndex].data = data;

        if (size == 0) {
            head = nodeIndex;
        } else {
            int current = head;
            while (array[current].next != -1) {
                current = array[current].next;
            }
            array[current].next = nodeIndex;
        }

        array[nodeIndex].next = -1;

        size++;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        int current = head;
        for (int i = 0; i < index; i++) {
            current = array[current].next;
        }

        return array[current].data;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            head = array[head].next;
        } else {
            int current = head;
            for (int i = 0; i < index - 1; i++) {
                current = array[current].next;
            }

            int nodeToRemove = array[current].next;
            array[current].next = array[nodeToRemove].next;

            // Reset the removed node to default values
            array[nodeToRemove].data = 0;
            array[nodeToRemove].next = -1;
        }

        size--;
    }


    public static void main(String[] args) {
        FixedSizeLinkedList myList = new FixedSizeLinkedList(10);

        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(8);
        myList.add(9);
        myList.add(10);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);

//        myList.add(4);

        System.out.println("Item at index 2: " + myList.get(2));

        myList.remove(2);

        System.out.println("Item at index 2: " + myList.get(2));
    }
}