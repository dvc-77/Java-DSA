package com.project300.data_structures.custom_linkedList;

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

        size++;
    }

    private void add(int data) {
        if(head == null) {
            linkFirst(data);
        }else {
            linkLast(data);
        }
    }

    private int getFirst() {
        return head.data;
    }

    private int getLast() {
        return tail.data;
    }

    public void display() { //
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

    public boolean removeFirst() {
        if(head != null) {
            head = head.next;
            head.prev = null;
            return true;
        }
        size--;
        return false;

    }

    public boolean removeLast() {   // Remove from last index
        if(tail != null) {
            tail = tail.prev;
            tail.next = null;
            return true;
        }
        size--;
        return false;
    }

    public boolean remove(int index) {     // Remove at ith index
        if(index == 0) {
            removeFirst();
            return false;
        }
        if(index == (size - 1)) {
            removeLast();
            return true;
        }
        if(head != null) {
            Node node = head;
            Node tempNode = null;
            for (int i = 1; i <= index; i++) {
                node = node.next;
                if(i == (index - 1)) {
                    tempNode = node;
                }
            }
            tempNode.next = node.next;
            size--;
            return true;
        }
        return false;
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
        list.add(9);
        list.add(15);
        list.remove(3);
//        list.removeFirst();
//        list.removeLast();
        list.display();

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
    }

}
