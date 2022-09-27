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
public class StudentComparatorTest  {
    public static void main(String[] args) {
         ArrayList<StudentComparator> studentList = new ArrayList<>();
    StudentComparator student1 = new StudentComparator(33, "Schneider", 59);
    StudentComparator student2 = new StudentComparator(44, "Levothyroxine", 44);
    StudentComparator student3 = new StudentComparator(55,"Acidophilus", 32);
    StudentComparator student4 = new StudentComparator(11,"Zithromiacin", 32);
    StudentComparator student5 = new StudentComparator(22,"Ginkgo Biloba", 35);
    
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5); 
    
    System.out.println("Before sorting using StudentNameComparator");
        for (StudentComparator student : studentList) {
            System.out.println(student);
        }
        System.out.println("---------");
        
        System.out.println("After sorting using StudentNameComparator");
        
        StudentNameComparator nameComparator = new StudentNameComparator();
        Collections.sort(studentList,nameComparator);
        
        for (StudentComparator student : studentList) {
            System.out.println(student);
        }
        System.out.println("");
        System.out.println("After sorting using StudentAgeComparator");
        
        StudentAgeComparator ageComparator = new StudentAgeComparator();
        Collections.sort(studentList,ageComparator);
        for (StudentComparator student : studentList) {
            System.out.println(student);
        }
        
        System.out.println("");
        System.out.println("After sorting using StudentIdComparator");
        
        StudentIDComparator idComparator = new StudentIDComparator();
        
        Collections.sort(studentList,idComparator);
        
        for (StudentComparator student : studentList) {
            System.out.println(student);
        }
    }   
}
