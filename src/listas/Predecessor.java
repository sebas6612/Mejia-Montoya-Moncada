package listas;

// Introduced in Chapter 6
/**
 * Something that has a next ListNode.
 *
 * @param <E>
 */
public interface Predecessor<E> {

    /**
     * Get the next ListNode.
     *
     * @return
     */
    public ListNode<E> getNext();

    /**
     * Set the next ListNode.
     *
     * @param next
     */
    public void setNext(ListNode<E> next);
}
