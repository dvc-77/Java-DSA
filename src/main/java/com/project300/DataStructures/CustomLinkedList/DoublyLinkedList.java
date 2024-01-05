package com.project300.DataStructures.CustomLinkedList;

public class DoublyLinkedList {

    private class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }


    private void linkFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;

        if(tail == null) {
             tail = head;
            tail.next = null;
        }

        size++;
    }

    private void linkLast(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    private void add(int data) {
        if(head == null) {
            linkFirst(data);
        }else {
            linkLast(data);
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "<--> ");
            node = node.next;
            if (node == null) {
                System.out.print("END\n");
            }
        }
        System.out.println();
    }

    public void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.data + "<-->");
            node = node.prev;
            if (node == null) {
                System.out.print("END\n");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(3);
        list.add(5);
        list.add(6);
        list.display();
    }

}
