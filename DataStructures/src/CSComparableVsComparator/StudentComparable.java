/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSComparableVsComparator;

/**
 *
 * @author JeffreySchneider
 */
public class StudentComparable extends Student implements Comparable<StudentComparable> {

    public StudentComparable(int id, String name, int age) {
        super(id, name, age);
    }
    
    @Override
    public String toString() {
        return "StudentComparable{"  + super.toString()+ '}';
    }

        /**
     * If the first object is greater than the second, return a positive number
     * (usually 1). If the first object equals the second, return a zero (0); If
     * the first object is less than the second, return a negative number
     * (usually -1).
     *
     * @param otherStudent
     * @return
     */
//    public int compareTo(StudentComparable otherStudent) //This example is how to compare numbers.
//    // Rename this method compareToBkup when demonstrating other type of sort.
//    {
//        if (this == otherStudent) {
//            return 0;
//        } else if (this.getAge() > otherStudent.getAge()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
    @Override
    public int compareTo(StudentComparable otherStudent) //This example is how to compare non-numbers.
       //  Comment out this method when demonstrating other type of sort.
    {
        //return this.getId().compareTo(otherStudent.getId());
        return Integer.compare(this.getId(),otherStudent.getId()); 
    }
}
