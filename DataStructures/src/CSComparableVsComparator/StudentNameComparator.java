/*
 */
package CSComparableVsComparator;

import java.util.Comparator;

/**
 * @author JeffreySchneider
 */
public class StudentNameComparator implements Comparator<StudentComparator>{
     public int compare(StudentComparator firstStudent, StudentComparator secondStudent) {
        //return Integer.compare(firstStudent.getAge(), secondStudent.getAge());
        return firstStudent.getName().compareTo(secondStudent.getName());
    }
}
