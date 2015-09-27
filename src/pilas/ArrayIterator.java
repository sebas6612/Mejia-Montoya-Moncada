package pilas;

// Introduced in Chapter 5
import java.util.Iterator;
import pilas.ArrayList;

/**
 * Iterator associated with an ArrayList.
 * @param <E>
 */
public class ArrayIterator<E> implements Iterator<E> {

    /**
     * List being traversed.
     */
    private ArrayList<E> list;
    /**
     * Index of the last element returned by next().
     */
    private int previous;

    /**
     * The Iterator begins ready to visit element 0.
     * @param list
     */
    public ArrayIterator(ArrayList<E> list) {
        this.list = list;
        previous = -1;
    }

    @Override
    public boolean hasNext() {
        return (previous + 1) < list.size();
    }

    @Override
    public E next() {
        previous++;
        return list.get(previous);
    }

    @Override
    public void remove() {
        list.remove(previous);
        previous--;
    }
}