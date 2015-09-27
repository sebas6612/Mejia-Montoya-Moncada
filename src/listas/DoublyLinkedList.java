/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Iterator;

/**
 *
 * @author user
 * @param <E>
 */
public class DoublyLinkedList<E> implements List<E> {

    private DoublyLinkedNode<E> front;

    public DoublyLinkedList() {
        front = null;
    }

    @Override
    public void add(E target) {
        if (isEmpty()) {
            front = new DoublyLinkedNode<>(target);
            front.setPrevious(null);
        } else {
            DoublyLinkedNode<E> last = front;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(new DoublyLinkedNode<>(target));
            last = last.getNext();
            last.setPrevious(last.getPrevious());
        }
    }

    @Override
    public boolean contains(E target) {
    return false;
    }

    @Override
    public E get(int index) {
        DoublyLinkedNode<E> node = front;
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
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(E target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int index, E target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        int tally = 0;
        for (DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext()) {
            tally++;
        }

        return tally;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void reserve(){
        DoublyLinkedNode<E> node = front;
        DoublyLinkedList<E> aux;
        
        for (int i = 0; i < size(); i++) {
            node = node.getNext();
        }
        
    }

}
