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
        DoublyLinkedNode<E> prev = front;
        DoublyLinkedNode<E> node = front;

        for (int i = 0; i < index; i++) {
            prev = node;
            node = node.getNext();
        }

        prev.setNext(node.getNext());

        return node.getItem();
    }

    @Override
    public boolean remove(E target) {
        DoublyLinkedNode<E> prev = front;
        DoublyLinkedNode<E> node = front;

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
        DoublyLinkedNode<E> node = front;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setItem(target);
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

    public void reserve() {
        DoublyLinkedList<E> aux = null;

        for (DoublyLinkedNode<E> node = front; node != null; node = node.getNext()) {
            if (node.getNext() == null) {
                while (node.getPrevious() != null) {
                    aux.add(node.getItem());
                }
            }
        }
    }
}
