package com.project300.data_structures.stacks_and_queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    protected boolean isFull() {
        return ptr == data.length -1;
    }

    protected boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) {
        if (!isFull()) {
            ptr++;
            data[ptr] = item;
            return true;
        }
        System.out.println("Stack is Full");
        return false;
    }

    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("Empty");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty");
        }
        return data[ptr];
    }


}
