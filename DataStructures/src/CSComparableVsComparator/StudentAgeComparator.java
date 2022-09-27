/**
 * To sort student objects by age, we must focus on the getAge() method.
    
 */
package CSComparableVsComparator;

import java.util.Comparator;

/**
 *
 * @author JeffreySchneider
 */
public class StudentAgeComparator implements Comparator<StudentComparator>{
     public int compare(StudentComparator firstStudent, StudentComparator secondStudent) {
        return Integer.compare(firstStudent.getAge(), secondStudent.getAge());        
    }
}
