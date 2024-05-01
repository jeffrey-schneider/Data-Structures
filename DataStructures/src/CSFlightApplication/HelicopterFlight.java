package CSFlightApplication;

import CSFlightApplication.BaseFlight;

public class HelicopterFlight extends BaseFlight {
	

    public HelicopterFlight(int aircraftID, int speed, double latitude, double longitude, String planeType, int fuel,
			int course, int altitude) {
		super(aircraftID, speed, latitude, longitude, planeType, fuel, course, altitude);
		// TODO Auto-generated constructor stub
	}


	@Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * Allows negative speeds for reverse flight.
     * @param speed
     * @return 
     */
    @Override
    protected boolean isValidSpeed(int speed){     
           return true;
    }
    
    
    
    
    @Override
    public int compareTo(BaseFlight o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.getFuel() > o.getFuel()){
            return 1;
        }else if(this.getFuel() < o.getFuel()){
            return -1;
        }else{
            return 0;
        }
    }
}
