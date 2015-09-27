/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

/**
 *
 * @author usuario
 * @param <E>
 */
public class Node<E> {

    /**
     * The item stored in this node.
     */
    private E item;
    /**
     * The node following this one.
     */
    private Node<E> next;

    /**
     * Put item in a node with no next node.
     *
     * @param item
     */
    public Node(E item) {
        this.item = item;
        next = null;
    }

    /**
     * Put item in a node with the specified next node.
     *
     * @param item
     * @param next
     */
    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

    /**
     * Return the item stored in this node.
     *
     * @return
     */
    public E getItem() {
        return item;
    }

    /**
     * Return the next node.
     *
     * @return
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Replace the item stored in this node.
     *
     * @param item
     */
    public void setItem(E item) {
        this.item = item;
    }

    /**
     * Set the next node.
     *
     * @param next
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
