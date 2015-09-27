/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author usuario
 * @param <E>
 */
public class DoublyLinkedNode<E> {

    private DoublyLinkedNode<E> previous;
    private E item;
    private DoublyLinkedNode<E> next;

    public DoublyLinkedNode(E item) {
        this.previous = null;
        this.item = item;
        this.next = null;
    }

    public DoublyLinkedNode(DoublyLinkedNode<E> previous, E item, DoublyLinkedNode<E> next) {
        this.previous = previous;
        this.item = item;
        this.next = next;
    }

    public DoublyLinkedNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedNode<E> previous) {
        this.previous = previous;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public DoublyLinkedNode<E> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<E> next) {
        this.next = next;
    }

    public void remove() {
    }
}
