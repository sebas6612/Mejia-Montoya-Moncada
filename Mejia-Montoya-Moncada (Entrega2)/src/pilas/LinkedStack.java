package pilas;

// Introduced in Chapter 6
import comun.EmptyStructureException;
import comun.Node;

/**
 * A linked Stack.
 *
 * @param <E>
 */
public class LinkedStack<E> implements Stack<E> {

    /**
     * The top ListNode in the Stack.
     */
    private Node<E> top;

    /**
     * The Stack is initially empty.
     */
    public LinkedStack() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public E peek() throws EmptyStructureException {
        if (isEmpty()) {
            throw new EmptyStructureException();
        }

        return top.getItem();
    }

    @Override
    public E pop() throws EmptyStructureException {
        if (isEmpty()) {
            throw new EmptyStructureException();
        }

        E result = top.getItem();
        top = top.getNext();

        return result;
    }

    @Override
    public void push(E target) {
        top = new Node<>(target, top);
    }
}
