package CSLinkedList;


import java.util.ArrayList;

import CSComparableVsComparator.Student;

/**
 *
 * @author JCSchneider
 */
public class SortedSingleLinkedListTest {
    public static void main(String[] args) {
        SortedSingleLinkedList<String> names = new SortedSingleLinkedList<>();
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
        
        System.out.println("Get size " + names.getSize());
        names.printMe();
        //names.printAll();
        
        try{
        System.out.println("->" + names.get(0));
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
        
        names.reverse();
        names.printAll();
        
        System.out.println("Part Two");
        
        SortedSingleLinkedList<Student> studentList = new SortedSingleLinkedList<>();
        
        studentList.add(new Student(1,"Smith",30));        
        studentList.add(new Student(2,"Jones", 31));
        studentList.add(new Student(3,"Taylor", 22));
        studentList.add(new Student(4,"Brown", 23));
        studentList.add(new Student(5,"Williams",24));
        studentList.add(new Student(6,"Wilson",25));
        studentList.add(new Student(123, "Johnson", 999));
        
        studentList.printAll();
        
      
    }
            
}
