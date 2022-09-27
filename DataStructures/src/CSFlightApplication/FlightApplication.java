/*
 */
package CSFlightApplication;

import java.util.ArrayList;
import java.util.*; 
/**
 *
 * @author JeffreySchneider
 */
public class FlightApplication {
    public static void main(String[] args) {
        System.out.println("\n\nFlight Testing");
        CommercialFlight comm1 = new CommercialFlight(25, 250, "AA123", "XYZ", 
                "DTW", 52, 450, 35.66, -135, "737", 35000, 90, 30000);
        System.out.println(comm1.toString());
        comm1.changeSpeed(-1000);
        System.out.println(comm1.toString());
        comm1.changeCourse(-180);
        System.out.println(comm1.toString());
        
        System.out.println("Add the crew to comm2");
        ArrayList crew = new ArrayList<String>();
        crew.add("Unger");
        crew.add("Dunne");
        CommercialFlight comm2 = new CommercialFlight(0, 0, "flightNo", "ABC", 
                "departureLocation", crew, 
                0, 0, 0, 0, "planeType", 0, 0, 0);
        System.out.println(comm2.toString()); 

        CommercialFlight comm3 = new 
            CommercialFlight(12, 50, "Doomed Flight", "DTW", "CHA", crew, 6, 750, 
                    25.0, -135.0, "707", 3500, 360, 25000);
       
        System.out.println("");
        
        PrivateFlight piper1 = new PrivateFlight("XYZ123", "CHA", "Collegedale", 1, 
                65, 250, 35.668, -135.21, 
                "Piper Cub", 50, 273, 1500);
        System.out.println(piper1.toString());
        piper1.changeCourse(150);
        piper1.changeSpeed(-251);
        System.out.println(piper1.toString());
        System.out.println("");
//        
        System.out.println("");
        MilitaryFlight mil1 = new MilitaryFlight("Bombing", true, 666, 300, 35.667, 
                -135.2, "B-52", 25000, 180, 35000);
        MilitaryFlight mil2 = new MilitaryFlight("Bombing", true, 666, 300, 35.667, 
            -135.2, "A-10", 25000, 180, 35000);
        System.out.println(mil1.toString());
        mil1.changeCourse(-190);
        System.out.println(mil1.toString());
        System.out.println("");
        
        ArrayList<MilitaryFlight> milFlight = new ArrayList<>();
        milFlight.add(mil1);
        milFlight.add(mil2);
        //If class doesn't have a compareTo, fall back on the super class.
        System.out.println("\nSorting military");
        System.out.println("Before sort:");
        for (Object object : milFlight) {
            System.out.println(object);
        }
        
        
        for (MilitaryFlight militaryFlight : milFlight) {
            System.out.println(militaryFlight);
        }
        System.out.println("End military flights.");
        
        ArrayList<CommercialFlight> flightList = new ArrayList<CommercialFlight>();
        flightList.add(comm1);
        flightList.add(comm2);
        flightList.add(comm3);
        
    }
}
