package StudentSorting;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author JCSchneider
 */
public class Student implements Comparable<Student> {

    public Student(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    private int id;
    private String name;
    private LocalDate dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "Student { " + " id = " + id
                + " name= " + name
                + " dob = " + getDob()
                + " age= " + getAge() + ")";
    }

    //  @Override
    /**
     * Non numeric ordering
     */
//    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
//    }
    @Override
    public int compareTo(Student o) {
        if (this == o) {
            return 0;
        } else if (this.getAge() > o.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.getAge();
        return hash;
    }

}
