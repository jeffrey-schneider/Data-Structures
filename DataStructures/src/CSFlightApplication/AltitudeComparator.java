/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSFlightApplication;

import java.util.Comparator;

/**
 *
 * @author JCSchneider
 */
public class AltitudeComparator implements Comparator<BaseFlight> {

    @Override
    public int compare(BaseFlight o1, BaseFlight o2) {
        return Integer.compare(o1.getAltitude(), o2.getAltitude());
    }
    
}
