/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Iterator;

/**
 *
 * @author sebastian
 */
public class DoubleLinkedList<E> implements List{
    
    private DoublyLinkedNode<E> front;
    
    public DoubleLinkedList() {
        front = null;
    }

    @Override
    public void add(Object target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void add(int index, Object target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object target) {
        for (DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext()) {
            if (node.getItem().equals(target)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
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
    public Object remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int index, Object target) {
        DoublyLinkedNode<E> node = front;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setItem((E) target);
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
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
