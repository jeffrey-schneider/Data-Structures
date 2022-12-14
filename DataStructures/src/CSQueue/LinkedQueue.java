/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSQueue;

/**
 *
 * https://algs4.cs.princeton.edu/13stacks/LinkedQueue.java.html
 *
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The {@code LinkedQueue} class represents a first-in-first-out (FIFO) queue of
 * generic items. It supports the usual <em>enqueue</em> and <em>dequeue</em>
 * operations, along with methods for peeking at the first item, testing if the
 * queue is empty, and iterating through the items in FIFO order.
 * <p>
 * This implementation uses a singly linked list with a non-static nested class
 * for linked-list nodes. See {@link Queue} for a version that uses a static
 * nested class. The <em>enqueue</em>, <em>dequeue</em>, <em>peek</em>,
 * <em>size</em>, and <em>is-empty</em>
 * operations all take constant time in the worst case.
 * <p>
 * For additional documentation, see
 * <a href="https://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class LinkedQueue<E> implements Iterable<E> {

    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue    

    /**
     * Initializes an empty queue.
     */
    public LinkedQueue() {
        first = null;
        last = null;
        n = 0;
    }

    /**
     * Is this queue empty?
     *
     * @return true if this queue is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns the item least recently added to this queue.
     *
     * @return the item least recently added to this queue
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return first.item;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return first.item;
    }

    /**
     * Adds the item to this queue.
     *
     * @param item the item to add
     */
    public void enqueue(E item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        n++;
    }

    public void remove(E item) {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;

    }

    /**
     * Removes and returns the item on this queue.
     *
     * @return Item or null if queue is empty
     */
    public E poll() {
        if (isEmpty()) {
            return null;
        } else {
            E item = first.item;
            first = first.next;
            n--;
            return item;
        }
    }

    /**
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        E item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) {
            last = null;   // to avoid loitering
        }
        return item;
    }

    /**
     * Returns a string representation of this queue.
     *
     * @return the sequence of items in FIFO order, separated by spaces
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (E item : this) {
            s.append(item + " ");
        }
        return s.toString();
    }

    /**
     * Returns an iterator that iterates over the items in this queue in FIFO
     * order.
     *
     * @return an iterator that iterates over the items in this queue in FIFO
     * order
     */
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    // helper linked list class
    private class Node {

        private E item;
        private Node next;
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<E> {

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = current.item;
            current = current.next;
            return item;
        }
    }

}
