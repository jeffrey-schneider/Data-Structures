/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDoublyLinkedList;

/**
 *
 * @author JCSchneider
 */
public class DoubleLinkedListTest {

    private static DoublyLinkedList<String> newList;

    public static void main(String[] args) {
        DoublyLinkedList<String> names = new DoublyLinkedList<>();
        names.add("Joe");
        names.add("James");
        names.add("Matthew");
        names.add("Mark");        
        names.add("Luke");
        names.add("John");
        names.add("Mr. Ward");
        names.add("Mr. Ricketson");
        names.add("Ms. Mohammed");
        names.add("Dr. Saied");
        String students[] = { "Amy", "Micki", "Michael" };

        names.printAll();
        
        System.out.println("At index 3: " + names.getNode(3));
        System.out.println("Finding Jeff: " + names.searchFor("Jeff"));
        System.out.println("Finding Luther: " + names.searchFor("Luther"));
        System.out.println("Finding object at element 3: " + names.elementAt(3));
        System.out.println("Delete from end: " + names.deleteFromEnd());        
        System.out.println("Delete from end: " + names.deleteFromEnd());       
        
        names.printAll();
        System.out.println("Delete from start " + names.deleteFromStart());
        System.out.println("Popped: " + names.pop());
        names.addFirst("Abby");
        names.printAll();
        System.out.println("Push Zoe: ");
        names.push("Zoe");
        
        System.out.println("Enqueue Aaron");
        names.enqueue("Adam");
        names.printAll();
        System.out.println("Dequeue: " + names.dequeue());
        names.printAll();

        System.out.println("Add student array.");
        names.addAll(students);
        names.printAll();
        
        //Create a loop for testing
        //somehow do this:  names.head.next.next.next = names.head
        System.out.println("Detect Loop: " + names.detectLoop());
        
        
        //if(names.createLoop()){
            System.out.println("Detect Loop: " + names.detectLoop());
            System.out.println("Find Loop: " + names.findLoop());
        //}
        
        
        
        System.out.println("Middle " + names.findMiddleElementIteratively());
        System.out.println("Delete node at 3 " + names.deleteNode(3));
        names.printAll();
        System.out.println("Print list in reverse order.");               
        names.printReverse();
        
        System.out.println("Before reversing list:");
        names.printAll();
        
        //names.createLoop();
        names.reverse();
        System.out.println("After reversing list:");
        names.printAll();
        names.printList("Print List");

        newList = names.copyList();
        newList.printList("New List:");
        
        
        System.out.println("Lets make sure the lists are not linked to each other.");
        newList.pop();
        newList.pop();
        newList.pop();
        names.printList("Print Names");
        newList.printList("New List: ");
        
        
        names.printList("Names, again:");
        System.out.println("3rd from end:");
        System.out.println(names.findKthNodeFromEnd(6));
    }
}
