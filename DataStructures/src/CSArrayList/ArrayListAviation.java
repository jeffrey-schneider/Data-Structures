/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSArrayList;

import CSFlightApplication.CommercialFlight;
import CSFlightApplication.BaseFlight;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author JCSchneider
 */
public class ArrayListAviation {
    public static void main(String[] args){
        CSArrayList<CommercialFlight> commList = new CSArrayList<CommercialFlight>();
        
        CommercialFlight comm1 = new CommercialFlight(25, 251, "AA123", "KORD","KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000);
        System.out.println(comm1.toString());
        System.out.println("Is empty: " + commList.isEmpty());
        int counter = 0;
        
        CommercialFlight comm4 = new CommercialFlight(26, 251, "AA123", "KORD", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000);
        commList.add(comm4);

        commList.add(new CommercialFlight(18, 251, "United Express6291", "DFW", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));        
        commList.add(new CommercialFlight(26, 250, "China Airlines 140", "DFW", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));        
        commList.add(new CommercialFlight(27, 250, "Purolator123", "DFW", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));        
        commList.add(new CommercialFlight(28, 250, "Hubbard234", "DFW", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(29, 250, "Piedmont", "SLC", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(20, 250, "Republic", "SLC", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(21, 250, "Alaska Airlines", "SLC", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(22, 250, "American234", "SLC", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(23, 250, "Delta888", "ATL", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(24, 250, "Southern13", "MCO", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(25, 250, "North Central1", "IAD", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(31, 250, "Northwest Orient888", "ATL", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(32, 250, "National345", "DEN", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(39, 250, "Braniff887", "IAD", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(40, 250, "Easter123", "ATL", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(50, 250, "Frontier123", "MCO", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(10, 250, "Ozark123", "DEN", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(11, 250, "Republic123", "ATL", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        commList.add(new CommercialFlight(12, 250, "Pan Am123", "IAD", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000));
        


    CommercialFlight newFlight = new CommercialFlight(250, 250, "AA123", "ATL", "KCHA", 52, 450, 35.66, -85, "737", 35000, 90, 30000);

        
        
        commList.printAll();        
        System.out.println("size: " + commList.length());
        
        System.out.println("Clear");
        //commList.clear();
        System.out.println("Print All:");
        commList.printAll();
        System.out.println("size: " + commList.length());
        
        
        System.out.println("Get:" + commList.get(1));
        System.out.println("Set: " + commList.set(15, newFlight));
        
        commList.printAll();
        System.out.println("size: " + commList.length());
        
        System.out.println("Remove 15: " + commList.remove(15));
        System.out.println("size: " + commList.length());
        
        
        System.out.println("Remove range 10-15" + commList.removeRange(10, 14));
        commList.printAll();
        
        
        
        /** How do we change the course of one commercial flight 
         Use an iterator!! */
        System.out.println("Iterator action:");
        Iterator it = commList.iterator();
        while(it.hasNext()){
            CommercialFlight checker = (CommercialFlight)it.next();
            if(checker.getAircraftID() == 11){
                System.out.println(checker.toString());
                checker.changeCourse(270);
                System.out.println(checker.toString());
            }
        }
        
      
                
    }
}



