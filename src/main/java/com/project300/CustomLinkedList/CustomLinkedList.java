package com.project300.CustomLinkedList;

public class CustomLinkedList {
    /*  LINKEDLIST IMPLEMENTATION
    *-----------------------------
    *-----------------------------
    * Basically it stores data in a group of disjoint non-contiguous
    * blocks of memory locations called nodes.
    * Nodes ideally refers to a data structure that contains data and reference to another node.
    *
    * Below is an implementation of a single linkedlist:
    *
    *
    *
    */

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Main components of a LinkedList


    private Node head;     // Points to the first node of the linkedlist
    private Node tail;     // Points to the last node of the linkedlist
    private int size;       // Allows tracking of the size of the linkedlist to ensure controlled traversal

    public CustomLinkedList() {
        this.size = 0;
    }

    // Insert first node
    public void linkFirst(int value) {
        Node newNode = new Node(value); // create new Node
        newNode.next = head;    // Point new Nodes next address to where Head was pointing to
        head = newNode; // Update head

        // If tail has no value, it means this is actually the first value
        if (tail == null) {
            tail = head;
        }

        // Update size of LinkedList
        size++;
    }

    // Add data to LinkedList
    public void add(int value) {
        linkLast(value);    // Add data to the end of the linkedlist
    }


    public void linkLast(int value) {
        /*
        * Algorithm -
        * Create new node
        * Update tail node's reference to point to new node
        * Update tail to point to new node
        *
        * In case, there is no tail, just make entry for new node
        */

        if (tail == null) {     // Case where there may be no node in the linkedlist
            linkFirst(value);
            return;
        }



        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        // Increase size
        size++;
    }

    // Read from the LinkedList
    private Node get(int index) {
        Node node = head;
        int count = 0;

        //  Traverse list to find node if it isn't 'null' and exists, and return node
        while (count < size) {
            if (count == (index)) {
                return node;
            }
            node = node.next;
            count++;
        }

        // Returns null to indicate node doesn't exist at that index
        return node;
    }


    // Insert through LinkedList
    public void insert(int value, int index) {
        if (index == 0) {
            linkFirst(value);
            return;
        }
        if (index == size) {
            linkLast(value);
            return;
        }

        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        Node newNode = new Node(value, node.next);
        node.next = newNode;
        size++;


    }


    public void removeFirst() {

        Node node = head;
        if (head != null) {
            head = node.next;
        }else {
            tail = null;
        }

        // Decrease the size
        size--;
    }

    // Remove last from LinkedList
    public void removeLast() {
        if(size <= 1) {
            removeFirst();
            return;
        }
        // (size - 1) is equal to last index of List, so (size - 1) - 1 would mean the last but one inde
        Node node = get(size - 2);
        tail = node;
        tail.next = null;

        // Decrease the size
        size--;
    }

    // Remove from linkedList
    public void remove(int index) {
        if(index == 0) {
            removeFirst();
            return;
        }
        if(index == (size - 1)) {
            removeLast();
            return;
        }
        // Get node after index
        Node node = get(index + 1);

        // Set index for node before index
        int beforeNodeIndex = index - 1;

        // Get node before index
        Node beforeNode = get(beforeNodeIndex);

        // Set the node before index to point to node after the index to be removed
        beforeNode.next = node;
    }

    // Display LinkedList values
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "-> ");
            node = node.next;
            if (node == null) {
                System.out.print("END\n");
            }
        }
    }


    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(3);
        list.add(5);
        list.add(5);
        list.add(8);
//        System.out.println(list.get(4));
        list.insert(3, 3);

        list.removeLast();

//        list.linkLast(99);
//        list.add(3);
        list.display();
//
//        System.out.println("-".repeat(28));
//        list.removeLast();
        list.removeFirst();
//        list.display();

//        list.remove(3);
        list.display();
//
//
//    }


    }
}
