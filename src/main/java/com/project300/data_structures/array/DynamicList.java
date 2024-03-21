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

    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    public void add(int index, E element) {
        checkIndexOutOfBound(index);
        ensureCapacityForInsertion(index);

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndexOutOfBound(index);
        E removedElement = (E) elements[index];

        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;

        return removedElement;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            grow();
        }
    }

    private void ensureCapacityForInsertion(int index) {
        if (size == elements.length) {
            grow();
        }
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    private boolean checkIndexOutOfBound(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Illegal Index: " + index);
        }
        return false;
    }

    public void trimToSize() {
        if (size < elements.length) {
            elements = Arrays.copyOf(elements, size);
        }
    }

    public E get(int index) {
        checkIndexOutOfBound(index);
        return (E) elements[index];
    }

    public int size() {
        return size;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }


}
