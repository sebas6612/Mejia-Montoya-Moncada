package listas;

//
import java.util.Iterator;

/**
 * A linked list.
 *
 * @param <E>
 */
public class LinkedList<E> implements List<E>, Predecessor<E> {

    /**
     * The first node in the List.
     */
    private ListNode<E> front;

    /**
     * A LinkedList is initially empty.
     */
    public LinkedList() {
        front = null;
    }

    @Override
    public void add(E target) {
        Predecessor<E> last = this;

        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(new ListNode<>(target));
    }

    @Override
    public boolean contains(E target) {
        for (ListNode<E> node = front;
                node != null;
                node = node.getNext()) {
            if (node.getItem().equals(target)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        ListNode<E> node = front;

        for (int i = 0; node != null && i < index; i++) {
            node = node.getNext();
        }

        if (node != null) {
            return node.getItem();
        } else {
            return null;
        }
    }

    @Override
    public ListNode<E> getNext() {
        return front;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this);
    }

    @Override
    public E remove(int index) {
        Predecessor<E> prev = this;
        ListNode<E> node = front;

        for (int i = 0; i < index; i++) {
            prev = node;
            node = node.getNext();
        }

        prev.setNext(node.getNext());

        return node.getItem();
    }

    @Override
    public boolean remove(E target) {
        Predecessor<E> prev = this;
        ListNode<E> node = front;

        while (node != null) {
            if (node.getItem().equals(target)) {
                prev.setNext(node.getNext());
                return true;
            }
            prev = node;
            node = node.getNext();
        }

        return false;
    }

    @Override
    public void set(int index, E target) {
        ListNode<E> node = front;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setItem(target);
    }

    @Override
    public void setNext(ListNode<E> next) {
        front = next;
    }

    @Override
    public int size() {
        int tally = 0;
        for (ListNode<E> node = front;
                node != null;
                node = node.getNext()) {
            tally++;
        }

        return tally;
    }

    @Override
    public String toString() {
        String result = "( ";

        for (ListNode<E> node = front;
                node != null;
                node = node.getNext()) {
            result += node.getItem() + " ";
        }

        return result + ")";
    }
}
