/**
 * Now that we have a clear understanding of natural ordering with Comparable, let's 
 * see how we can use other types of ordering, in a more flexible manner than directly 
 * implementing an interface.
 * 
 * Imagine we don't have access to the object's class, maybe we don't have the source
 * code. Ergo, we cannot add the Comparable interface to the object in question.
 * We need an 'external' process to help us order the objects.  We will use a 
 * Comparator - a separate object tasked with setting the sort order.
 *
 * The Comparator interface defines a compare(arg1, arg2) method with two arguments 
 * that represent compared objects and works similarly to the Comparable.compareTo() 
 * method.
 * 
 * To create a Comparator, we have to implement the Comparator interface.
 * 
 */
package CSComparableVsComparator;
/**
 *
 * @author JeffreySchneider
 */
public class StudentComparator extends Student {
    public StudentComparator(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "StudentComparator{" + super.toString() + '}';
    }
}
