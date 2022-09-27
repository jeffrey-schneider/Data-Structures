
package CSLinkedList;

import java.util.EmptyStackException;
import java.util.HashSet;

/**
 *
 * @author jcschneider
 */
public class SingleLinkedList<E> {

    protected Node<E> head = null;
    public int size = 0;

    protected void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }

    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
        }
        //Return data at old head or null if list is empty
        if (temp != null) {
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    public boolean searchFor(E item) {
        Node<E> node = head;   //initialize current
        while (node != null) {
            if (node.data.equals(item)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.data;
    }

    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }

    public boolean add(E item) {
        add(size, item);
        return true;
    }
    
    
    public boolean createLoop(){
        //Used for debug and testing, 
        if ( head == null){
          throw new IndexOutOfBoundsException("Empty list.");
        }
        if ( getSize() > 2){
            head.next.next = head.next;
            return true;
        }
        return false;
    }
        //somehow do this:  names.head.next.next.next = names.head
    
    public int getSize() {
        return size;
    }
    
    public int size() {
        return size;
    }
    public int indexOf(E target) {
        //TO DO:
        for (int i = 0; i < getSize(); i++) {
            if (true) {

            }
        }
        return 0;
    }

    public void printAll() {
        if(detectLoop()){
            System.out.println("Resolve detected loop.");
            
        }else{
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
        }
    }
    
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public int findLength(){
        Node curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    
    public Node<E> findMiddleNode(){
        Node slowPtr, fastPtr;
        slowPtr = fastPtr = head;
        while(fastPtr.next != null && fastPtr.next.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;            
        }
        return slowPtr;
    }
    
    //Adapted from geeksforgeeks.org/detect-loop-in-a-linked-list.html
    public boolean detectLoop(){
        HashSet<Node> s = new HashSet<Node>();
        Node current = head;
        while(current != null){
            if(s.contains(current)){
                return true;
            }
            s.add(current);
            current=current.next;
        }
        return false;
    }   
        
       
    //Another way to do this using two pointers
    public boolean findLoop() {
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

    
   
protected static class Node<E> {
     E data;
     Node<E> next;

     Node(E dataItem) {
        data = dataItem;
        next = null;
    }

     Node(E dataItem, Node<E> nodeRef) {
        data = dataItem;
        next = nodeRef;
    }
}
}
