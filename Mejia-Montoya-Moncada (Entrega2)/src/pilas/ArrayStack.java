package pilas;

import comun.EmptyStructureException;

/**
 * An array-based Stack.
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

    /**
     * Array of items in this Stack.
     */
    private E[] data;
    /**
     * Number of items currently in this Stack.
     */
    private int size;

    /**
     * The Stack is initally empty.
     */
    public ArrayStack() {
        data = (E[]) (new Object[1]);
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return true if data is full.
     * @return 
     */
    protected boolean isFull() {
        return size == data.length;
    }

    @Override
    public E peek() throws EmptyStructureException {
        if (isEmpty()) {
            throw new EmptyStructureException();
        }

        return data[size - 1];
    }

    @Override
    public E pop() throws EmptyStructureException {
        if (isEmpty()) {
            throw new EmptyStructureException();
        }
        size--;

        return data[size];
    }

    @Override
    public void push(E target) {
        if (isFull()) {
            stretch();
        }

        data[size] = target;
        size++;
    }

    /**
     * Double the length of data.
     */
    protected void stretch() {
        E[] newData = (E[]) (new Object[2 * data.length]); // Warning

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }
}
