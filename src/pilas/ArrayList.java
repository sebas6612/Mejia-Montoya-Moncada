package pilas;

import java.util.Iterator;
import listas.List;

/**
 * An array-based List.
 *
 * @param <E>
 */
public class ArrayList<E> implements List<E> {

    /**
     * Array of elements in this List.
     */
    private E[] data;
    /**
     * Number of elements currently in this List.
     */
    private int size;

    /**
     * The List is initially empty.
     */
    public ArrayList() {
        data = (E[]) (new Object[1]);
        size = 0;
    }

    @Override
    public void add(E target) {
        if (isFull()) {
            stretch();
        }

        data[size] = target;
        size++;
    }

    @Override
    public boolean contains(E target) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(target)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return true if data is full.
     *
     * @return
     */
    protected boolean isFull() {
        return size == data.length;
    }

    
    public Iterator<E> iterator() {
        return new ArrayIterator<>(this);
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return data[index];
    }

    @Override
    public E remove(int index) {
        E result = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }

        size--;

        return result;
    }

    @Override
    public boolean remove(E target) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(target)) {
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                size--;
                return true;
            }
        }

        return false;
    }

    @Override
    public void set(int index, E target) {
        data[index] = target;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Double the length of data.
     */
    protected void stretch() {
        E[] newData = (E[]) (new Object[2 * data.length]);

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    @Override
    public String toString() {
        String result = "[ ";

        for (int i = 0; i < size; i++) {
            result += data[i] + " ";
        }

        return result + "]";
    }
    
    public void removeN(E target){
        while(contains(target)){
            remove(target);
        }
    }
}
