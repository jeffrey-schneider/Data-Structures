package StudentSorting;

import StudentSorting.Student;
import java.util.Comparator;

class StudentIdComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return Integer.compare(firstStudent.getId(), secondStudent.getId());
    }
}

class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return Integer.compare(firstStudent.getAge(), secondStudent.getAge());
    }
}

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class StudentAgeNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int ageCompare = Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
        if (ageCompare != 0) {
            return ageCompare;
        } else {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }
}

class StudentDOBComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.valueOf(o1.getDob().compareTo(o2.getDob()));
    }

}
