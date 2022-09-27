/**
 * Program to test the local SingleLinkedList object.
 */
package CSLinkedList;

import CHComparableVsComparator.Student;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jcschneider
 */
public class SingleLinkedListTest {

    public static void main(String[] args) {
        SingleLinkedList<String> names = new SingleLinkedList<>();
        names.addFirst("Lev Othyroxin");
        names.addFirst("Acidophilous the philosopher");
        names.addFirst("Gingko Biloba");
        names.addFirst("Steve Atorvastatin");
        names.addFirst("Lis Inopril");
        names.addFirst("Matt Formin");        
        names.add("Al Buterol");
        names.add("Monte Lou Kast");
        names.add("Dr. A. Moxi Cillin");
        names.add("Ben Lafaxine");
        names.add("Randy Tidine");
        names.add("Lora Tadine");
        System.out.println("Check for loops " + names.detectLoop());
        names.createLoop();
        System.out.println("Check for loops " + names.findLoop());
        
        
        
        names.printAll();
        //for (int i = 0; i < names.getSize(); i++) {
        //    System.out.print(names.get(i) + " -> ");
        //}
        
        //names.set(6,"Anonymous");
        //names.printAll();
        //System.out.println("Looking for Acidophilous the philosopher: " + names.searchFor("Acidophilous the philosopher"));
        //System.out.println("Looking for Smith: " + names.searchFor("Smith"));
//        
//        System.out.println("Middle node: " + names.findMiddleNode().data);
//        
       SingleLinkedList<Integer> numbers = new SingleLinkedList<>();
       int counter = 0;
       while(counter<10){
           numbers.add(counter++);           
       }
       

       System.out.println("\nGetSize(): " + numbers.getSize());
        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(i + "->" + numbers.get(i));
        }
        
        numbers.printAll();
//        
        numbers.reverse();
        numbers.printAll();
        System.out.println("Length: " + numbers.findLength());
        
        SingleLinkedList<Student> students = new SingleLinkedList<>();
        Student student1 = new Student(-56, "fred", 25);
        students.addFirst(student1);
        students.addFirst(new Student(1,"Gonzalez",30));        
        students.addFirst(new Student(2,"Noel", 31));
        students.addFirst(new Student(3,"Malone", 22));
        students.addFirst(new Student(4,"Goodpasture", 23));
        students.addFirst(new Student(5,"Coleman",24));
        students.addFirst(new Student(6,"Daniels",25));
        students.add(new Student(123, "Schneider", 999));
//        
        students.printAll();
        System.out.println("Middle node: " + students.findMiddleNode().data);
//        
    }
    
}
