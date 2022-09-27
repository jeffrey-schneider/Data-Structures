/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDoublyLinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author jcschneider based on:
 * https://algorithms.tutorialhorizon.com/doubly-linked-list-complete-implementation/
 */
public class DoublyLinkedList<E> {

    int size = 0;
    Node<E> head = null;
    Node<E> tail = null;

    public void add(E data) {
        if (size == 0) {
            addFirst(data);
        } else {
            addAtEnd(data);
        }
    }

    public Node<E> addFirst(E data) {
        Node<E> node = new Node<E>(data);
        //If list is empty
        if (size == 0) {
            //head and tail both point to null
            head = tail = node;
            //head's previous will point to null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
            size++;
        } else {
            head.previous = node;
            node.next = head;
            node.previous = null;
            head = node;
            size++;
        }
        return node;
    }

    //Stack methods
    public Node<E> push(E data) {
        Node<E> node = addFirst(data);
        return node;
    }

    public E pop() {
        return deleteFromStart();
    }
    
    public E peek(){
        return head.data;
    }

    //Queue methods
    public Node<E> enqueue(E data) {
        Node<E> node = addAtEnd(data);
        return node;
    }

    public E dequeue() {
        return deleteFromEnd();
    }
//Only used for testing
    protected boolean createLoop() {        
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
        tail.next = head;
        return true;     
        
    }
    public Node<E> addAtEnd(E data) {
        Node<E> node = new Node<E>(data);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
        return node;
    }

    public void addAll(E[] data) {
        if (data.length > 0) {
            for (E i : data) {
                addAtEnd(i);
            }
        }
    }

    public Node addAfter(E data, Node<E> prevNode) {
        if (prevNode == null) {
            return null;
        } else if (prevNode == tail) { //Check if it is the last node
            return addAtEnd(data);
        } else {
            Node<E> node = new Node<E>(data);
            Node<E> nextNode = prevNode.next;
            prevNode.next = node;
            nextNode.previous = node;
            node.previous = prevNode;
            size++;
            return node;
        }
    }

    public E getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node.data;
    }

    public boolean searchFor(E item) {
        Node<E> node = head;
        while (node != null) {
            if (node.data.equals(item)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public E deleteFromEnd() {
        if (size == 0) {
            System.out.println("Empty List");
        } else if (size == 1) {
            deleteFromStart();
        } else {
            //store the 2nd last node
            E retVal = tail.data;
            Node<E> prevTail = tail.previous;
            //Detach the last node
            tail = prevTail;
            tail.next = null;
            size--;
            return retVal;
        }
        return null;
    }

    public E deleteFromStart() {
        if (size == 0) {
            System.out.println("Empty List");
        } else {
            E retVal = head.data;
            //Node<E> prevHead = head.previous;
            // Detach the first node
            head = head.next;
            //head = prevHead;
            head.previous = null;
            size--;
            return retVal;
        }
        return null;
    }

    private E deleteNode(Node<E> del) {
        if (head == null || del == null) {
            return null;
        }

        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.previous = del.previous;
        }
        if (del.previous != null) {
            del.previous.next = del.next;
        }

        del = null;
        return head.data;
    }

    public E deleteNode(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = head;
        for (int i = 0; node != null && i < index; i++) {
            node = node.next;
        }
        if (node == null) {
            return null;
        }

        return deleteNode(node);
    }
    
    

    public E elementAt(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = head;
        while (index - 1 != 0) {
            node = node.next;
            index--;
        }
        return node.data;
    }

    public int getSize() {
        return size;
    }

     public boolean isEmpty(){
            return size == 0;
     }
    public boolean printAll() {
        if(head == null){
            throw new IndexOutOfBoundsException("Empty list.");
        }
        if(detectLoop()) {
            return false;
        }
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        System.out.println("\nNodes: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
        return true;
    }

    /**
     * from techiedelight.com/merge-given-sorted-linked-lists/
     */
    public void printList(String msg){        
        if(head == null){
            throw new IndexOutOfBoundsException("Empty list.");
        }
        System.out.println(msg);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        }    
    

    public void printReverse() {        
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
        //Uses a stack                     
        Stack<Node> stk = new Stack<Node>();
        Node current = head;
        while (current != null) {
            stk.push(current);
            current = current.next;
        }
        //Print data from stack
        while (stk.size() > 0) {
            System.out.print(stk.peek().data + " ");
            stk.pop(); //pop after print        
        }
        //System.out.println("\n");     
    }

    public void reverse() {
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
        Node temp = null;
        Node current = head;
        /* 
       Swap next and previous for all nodes of doubly linked list. 
         */
        
        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }
        if (temp != null) {
            head = temp.previous;        
        }
    }

    //Adapted from geeksforgeeks.org/detect-loop-in-a-linked-list.html
    public boolean detectLoop() {
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
        HashSet<Node> s = new HashSet<Node>();
        Node current = head;
        while (current != null) {
            if (s.contains(current)) {
                return true;
            }
            s.add(current);
            current = current.next;
        }
        return false;
    }

    //Another way to do this using two pointers
    public boolean findLoop(){
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

    //Interview question:
    public E findMiddleElementIteratively() {
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
        if (size == 0) {
            System.out.println("Empty List");
            return null;
        } else {
            Node<E> slow = head;
            Node<E> fast = head;
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        } 
    }
        
 public E findKthNodeFromEnd(int k){
     if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
     int counter = 0;
     if(size ==0){
        System.out.println("Empty List");
        return null;
     }else{
        Node<E> slow = head;
        Node<E> fast = head;
        while(slow != null && fast != null && fast.next != null){
            if (counter < k- 1){
                fast = fast.next;                
            }else{
                fast = fast.next;
                slow = slow.next;
            }
            counter++;
            }
        return slow.data;
        }
 }
 
    /**
     * https://www.techiedelight.com/clone-given-linked-list/
     * @return 
     */
    public DoublyLinkedList<E> copyList(){
        if(head == null){throw new IndexOutOfBoundsException("Empty list.");}
       Node current = head;
       DoublyLinkedList<E> newList = new DoublyLinkedList<>();
       Node tail = null;

       while(current != null){
           //Special case for the first new node
           if(newList == null){
            newList.addFirst((E) current.data);
       }else{
            newList.addAtEnd((E) current.data);
       }
       current = current.next;
        }
    return newList;
        }      
                
                
    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> previous;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
            previous = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }
}

