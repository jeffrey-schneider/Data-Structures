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
public class MilitaryFlight extends BaseFlight{
    private String mission;
    private boolean inFlightRefuel;

    public MilitaryFlight(String mission, boolean inFlightRefuel, int aircraftID, int speed, double latitude, 
            double longitude, String planeType, int fuel, int course, int altitude) 
    {
        super(aircraftID, speed, latitude, longitude, planeType, fuel, course, altitude);
        this.mission = mission;
        this.inFlightRefuel = inFlightRefuel;
    }

    public boolean isInFlightRefuel() {
        return inFlightRefuel;
    }   
    
    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nMilitaryFlight{" +
                "mission= " + mission + ", inFlightRefuel= " + inFlightRefuel + '}';
    }

    
}
