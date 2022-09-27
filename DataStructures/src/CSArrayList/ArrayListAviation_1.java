/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSArrayList;

import java.util.Collections;
import java.util.Iterator;

import CSFlightApplication.BaseFlight;
import CSFlightApplication.CommercialFlight;

/**
 *
 * @author JCSchneider
 */
public class ArrayListAviation_1 {
    public static void main(String[] args){
        CSArrayList<CommercialFlight> commList = new CSArrayList<CommercialFlight>();
        System.out.println("Is empty: " + commList.isEmpty());
        int counter = 0;
        
//        public CommercialFlight(int commercialFlightID, int passengers, String flightNo, 
//            String destinationLocation, String departureLocation,
//            ArrayList<String> crew, int aircraftID, int speed, 
//            double latitude, double longitude, String planeType, 
//            int fuel, int course, int altitude) {
//        super(aircraftID, speed, latitude, longitude, planeType, fuel, 
//                course, altitude);
        CommercialFlight comm1 = new CommercialFlight(1, 250, "FlightNo", "CHA", 
                "DTW", 52, 450, 35.66, -135.0, "737", 3500, 90, 30000);
        
        commList.add(comm1);

        CommercialFlight comm2 = new CommercialFlight(2, 250, "616", "FLA", 
                "DTW", 45, 450, 35.66, -135.0, "737", 35000, 90, 30001);
                
        commList.add(new CommercialFlight(3, 270,"ZZ123", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(4, 270,"ZZ1213", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(5, 270,"ZZ1223", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(6, 270,"ZZ1233", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(7, 270,"ZZ1243", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(8, 270,"ZZ1253", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(9, 270,"ZZ1263", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(10, 270,"ZZ1273", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(11, 270,"ZZ1283", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(12, 270,"ZZ1293", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(13, 270,"ZZ123", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(14, 270,"ZZ123", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
        commList.add(new CommercialFlight(15, 270,"ZZ123", "CHA", "DTW", 65, 490, 35.67, -135.01, "747", 3600, 80,20100));
 CommercialFlight newFlight = new CommercialFlight(30,285,"SBC222","CHA","DTW", 88,500,35.8,-135.024,"767",37500,275,19000); 

        
        
        commList.printAll();        
        System.out.println("size: " + commList.length());
        
        System.out.println("Clear");
        //commList.clear();
        System.out.println("Print All:");
        commList.printAll();
        System.out.println("size: " + commList.length());
        
        
        System.out.println("Get:" + commList.get(1));
//        System.out.println("Set: " + commList.set(15, newFlight));
        
        commList.printAll();
        System.out.println("size: " + commList.length());
        
        System.out.println("Remove 1: " + commList.remove(1));
        System.out.println("size: " + commList.length());
        
        
        //System.out.println("Remove range 10-15" + commList.removeRange(10, 14));
        commList.printAll();
        
        
        
        /** How do we change the course of one commercial flight 
         Use an iterator!! */
        System.out.println("Iterator action:");
        Iterator it = commList.iterator();
        while(it.hasNext()){
            CommercialFlight checker = (CommercialFlight)it.next();
            if(checker.getAircraftID() == 15){
                System.out.println(checker.toString());
                checker.changeCourse(270);
                System.out.println(checker.toString());
            }
        }
        
      
                
    }
}



