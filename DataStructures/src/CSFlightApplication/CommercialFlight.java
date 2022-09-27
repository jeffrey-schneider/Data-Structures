/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSFlightApplication;

import java.util.ArrayList;

/**
 *
 * @author JeffreySchneider
 */
public class CommercialFlight extends BaseFlight 
{   
    private int commercialFlightID;
    private int passengers;
    private String flightNo;
    private String destinationLocation;
    private String departureLocation;
    private ArrayList<String> crew;    

    public CommercialFlight(int commercialFlightID, int passengers, String flightNo, 
            String destinationLocation, String departureLocation,
            ArrayList<String> crew, int aircraftID, int speed, 
            double latitude, double longitude, String planeType, 
            int fuel, int course, int altitude) {
        super(aircraftID, speed, latitude, longitude, planeType, fuel, 
                course, altitude);
        this.commercialFlightID = commercialFlightID;
        this.passengers = passengers;
        this.flightNo = flightNo;
        this.destinationLocation = destinationLocation;
        this.departureLocation = departureLocation;
        this.crew = crew;
    }

    public CommercialFlight(int commercialFlightID, int passengers, String flightNo, String destinationLocation, 
            String departureLocation, int aircraftID, int speed, double latitude, double longitude, String planeType, 
            int fuel, int course, int altitude) {
        super(aircraftID, speed, latitude, longitude, planeType, fuel, course, altitude);
        this.commercialFlightID = commercialFlightID;
        this.passengers = passengers;
        this.flightNo = flightNo;
        this.destinationLocation = destinationLocation;
        this.departureLocation = departureLocation;
    }

   
    public int getCommercialFlightID() {
        return commercialFlightID;
    }

    public void setCommercialFlightID(int commercialFlightID) {
        this.commercialFlightID = commercialFlightID;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

     public ArrayList<String> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<String> crew) {
        this.crew = crew;
    }   
    
 @Override
    public String toString() {
        return "CommercialFlight{" + "commercialFlightID=" + commercialFlightID +
                ", passengers=" + passengers + 
                ", flightNo=" + flightNo + ", destinationLocation=" + 
                destinationLocation + ", departureLocation=" + departureLocation +
                ",\n crew=" + crew + '}'
                + super.toString();
    }    
    

    
}
