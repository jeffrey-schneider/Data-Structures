/*
 
 */
package CSFlightApplication;
import java.util.*;

/**
 *
 * @author JCSchneider
 */
public class DestinationComparator implements Comparator<CommercialFlight>{

    @Override
    public int compare(CommercialFlight o1, CommercialFlight o2) {
        return o1.getDestinationLocation().compareTo(o2.getDestinationLocation());
    }
   
}
