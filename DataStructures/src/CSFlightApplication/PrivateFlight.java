/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSFlightApplication;

/**
 *
 * @author JeffreySchneider
 */
public class PrivateFlight extends BaseFlight {
    private String flightPlan;
    private String departure;
    private String arrival;
    private int passengers;

    public PrivateFlight(String flightPlan, String departure, String arrival, int passengers, int aircraftID, 
            int speed, double latitude, double longitude, String planeType, int fuel, int course, int altitude) {
        super(aircraftID, speed, latitude, longitude, planeType, fuel, course, altitude);
        this.flightPlan = flightPlan;
        this.departure = departure;
        this.arrival = arrival;
        this.passengers = passengers;
    }

    public void setFlightPlan(String flightPlan) {
        this.flightPlan = flightPlan;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getFlightPlan() {
        return flightPlan;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return  " PrivateFlight{" + "flightPlan=" + flightPlan + ", departure=" + departure + 
                ", arrival=" + arrival + ", passengers=" + passengers + '}' + super.toString();
    }
}
