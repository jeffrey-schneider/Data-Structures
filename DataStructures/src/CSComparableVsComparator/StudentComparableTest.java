/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author JeffreySchneider
 */
public class StudentComparableTest {
    public static void main(String[] args) {
    
    ArrayList<StudentComparable> studentList = new ArrayList<>();
    StudentComparable student1 = new StudentComparable(33, "Schneider", 59);
    StudentComparable student2 = new StudentComparable(44, "Levothyroxine", 44);
    StudentComparable student3 = new StudentComparable(55,"Acidophilus", 32);
    StudentComparable student4 = new StudentComparable(11,"Zithromiacin", 32);
    StudentComparable student5 = new StudentComparable(22,"Ginkgo biloba", 35);
    
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5); 
    
        System.out.println("Before sort:");
        for (StudentComparable student : studentList) {
            System.out.println(student);
        }
        
        Collections.sort(studentList);
        System.out.println("After sort:");
        for (StudentComparable student : studentList) {
            System.out.println(student);
        }
        /**
         * Another way to iterate through a list.
         */
        System.out.println("");
        Iterator<StudentComparable> iter = studentList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
