/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSFlightApplication;

import java.util.Comparator;

/**
 *
 * @author jschneider
 */
public class FuelComparator implements Comparator<CommercialFlight>
{
    @Override
    public int compare(CommercialFlight o1, CommercialFlight o2) {
        return Integer.compare(o1.getFuel(), o2.getFuel());        
    }
    
}
