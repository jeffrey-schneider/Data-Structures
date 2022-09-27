/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSFlightApplication;

import java.util.Comparator;
import java.util.function.ToIntFunction;

/**
 *
 * @author jschneider
 */
public class SpeedComparator implements Comparator<CommercialFlight> {

    @Override
    public int compare(CommercialFlight o1, CommercialFlight o2) {
        return Integer.compare(o1.getSpeed(), o2.getSpeed());
    }
}
