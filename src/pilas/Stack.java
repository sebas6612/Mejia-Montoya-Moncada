package pilas;

// Introduced in Chapter 4
/**
 * A last-in, first-out stack.
 *
 * @param <E>
 */
public interface Stack<E> {

    /**
     * Return true if this Stack is empty.
     *
     * @return
     */
    public boolean isEmpty();

    /**
     * Return the top item on this Stack, but do not modify the Stack.
     *
     * @return
     */
    public E peek();

    /**
     * Remove and return the top item on this Stack.
     *
     * @return
     */
    public E pop();

    /**
     * Add targer to the top of this Stack.
     *
     * @param target
     */
    public void push(E target);
}
