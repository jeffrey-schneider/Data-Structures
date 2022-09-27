/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JeffreySchneider
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
    Student student1 = new Student(33, "Schneider", 59);
    Student student2 = new Student(44, "Levothyroxine", 44);
    Student student3 = new Student(55,"Acidophilus", 32);
    Student student4 = new Student(11,"Zithromiacin", 32);
    Student student5 = new Student(22,"Ginkgo Biloba", 35);
    
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5); 
    
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
