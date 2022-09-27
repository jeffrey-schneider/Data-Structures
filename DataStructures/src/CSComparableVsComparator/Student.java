/**
 * Base Student class with no comparables or comparators 
 */
package CSComparableVsComparator;
import java.util.Objects;
/**
 *
 * @author JeffreySchneider
 */
public class Student {
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.age;
        hash = hash % 300;
//        hash = 5;
//        hash = Math.abs(hash);
//            hash = Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
//Instance Variables defining what a student is
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
 
    @Override
    public String toString() {
        return "Student{" + "id = " + id + ", name = " + name + ", "
                + "age = " + age + " hashcode = " + hashCode()+'}';
    } 
}
