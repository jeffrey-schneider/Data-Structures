/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSComparableVsComparator;

import java.util.Comparator;

/**
 *
 * @author JeffreySchneider
 */
public class StudentIDComparator  implements Comparator<StudentComparator>{

    @Override
    public int compare(StudentComparator firstStudent, StudentComparator secondStudent) {
        return Integer.compare(firstStudent.getId(), secondStudent.getId());
    }
    
}
