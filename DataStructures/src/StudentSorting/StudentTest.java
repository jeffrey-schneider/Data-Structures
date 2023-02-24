/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentSorting;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JCSchneider
 */
public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student(33, "Schneider", LocalDate.of(1962, 2, 1));
        Student student2 = new Student(44, "Levothyroxine", LocalDate.of(1965, 3, 14));
        Student student3 = new Student(55, "Acidophilus", LocalDate.of(1985, 05, 31));
        Student student4 = new Student(11, "Zithromiacin", LocalDate.of(1990, 01, 31));
        Student student5 = new Student(22, "Ginkgo Biloba", LocalDate.of(1997, 3, 30));
        Student student6 = new Student(18, "Gus Frink", LocalDate.of(1997, 3, 30));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        System.out.println("Before sort");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);
        System.out.println("After first sort");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList, new StudentIdComparator());
        System.out.println("After StudentIdComparator() sort");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList, new StudentNameComparator());
        System.out.println("After StudentNameComparator() sort");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList, new StudentAgeComparator());
        System.out.println("After StudentAgeComparator() sort");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList, new StudentAgeNameComparator());
        System.out.println("After StudentAgeNameComparator() sort");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList, new StudentDOBComparator());
        System.out.println("After StudentDOBComparator() sort");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

