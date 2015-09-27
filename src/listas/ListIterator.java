package listas;

// Introduced in Chapter 6
import java.util.Iterator;

/**
 * Iterator used by the LinkedList class.
 *
 * @param <E>
 */
public class ListIterator<E> implements Iterator<E> {

    /**
     * The Predecessor of node.
     */
    private Predecessor<E> previous;
    /**
     * The ListNode containing the last element returned, or the LinkedList
     * itself if no elements have yet been returned.
     */
    private Predecessor<E> node;

    /**
     * The ListIterator starts at the beginning of the List.
     *
     * @param list
     */
    public ListIterator(LinkedList<E> list) {
        previous = null;
        node = list;
    }

    @Override
    public boolean hasNext() {
        return node.getNext() != null;
    }

    @Override
    public E next() {
        previous = node;
        node = node.getNext();
        return ((ListNode<E>) node).getItem();
    }

    @Override
    public void remove() {
        previous.setNext(node.getNext());
        node = previous;
    }
}
