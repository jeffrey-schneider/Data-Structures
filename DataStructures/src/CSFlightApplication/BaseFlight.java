/*
 * This code demonstrates Abstraction and Polymorphism 
 */
package CSFlightApplication;

/**
 *
 * @author JeffreySchneider
 */
public abstract class BaseFlight {
//public abstract class BaseFlight   {
    private static int aircraftCounter = 0;
    private int aircraftID;
    private int speed;
    private double latitude;
    private double longitude;
    private String planeType;
    int fuel;
    private int course;
    private int altitude;
 
    @Override //Indicates polymorphism
    public String toString() {
        return "\nBaseFlight{" + "aircraftID=" + aircraftID + ", speed=" + speed +
                ", latitude=" + latitude + 
                ", longitude=" + longitude + ", planeType=" + planeType + 
                ", fuel=" + fuel + ", course=" + course +
                ", altitude=" + altitude + '}';
    }

    public BaseFlight(int aircraftID, int speed, double latitude, double longitude,
            String planeType, int fuel, int course, int altitude) {
        this.aircraftID = aircraftID;
        this.speed = speed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.planeType = planeType;
        this.fuel = fuel;
        this.course = course;
        this.altitude = altitude;
    }

    public static int getAircraftCounter() {
        return aircraftCounter;
    }

    public static void setAircraftCounter(int aircraftCounter) {
        BaseFlight.aircraftCounter = aircraftCounter;
    }

    public int getAircraftID() {
        return aircraftID;
    }

    public void setAircraftID(int aircraftID) {
        this.aircraftID = aircraftID;
    }

    public int getSpeed() {
        return speed;
    }

    
    public final boolean setSpeed(int speed) {
        if(isValidSpeed(speed)) {
        	this.speed = speed;	
        	return true;
        }
        return false;
    	
    }

    protected boolean isValidSpeed(int speed) {		
		return speed >= 0;
	}

	public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 || course <= 360) {
            this.course = course;
        } else if(course < 0){
            this.course = 360;
        } else if( course > 360){
            this.course = course;
        }        
    }
    
    public void changeCourse(int courseChange){
        this.course += courseChange;
        if(this.course >= 360)
            this.course -= 360;
        if(this.course < 0)
            this.course += 360;             
    }
    
    
    public final boolean changeSpeed(int speedChange){
        //aircraft cannot fly backward; disallow negative speed
        //int speedBuffer = speed;
        if(isValidSpeed(this.speed + speedChange)) {
        	this.speed += speedChange;
        	return true;
        }        
        return false;
    }


    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }    
    
    
    public boolean equals(Object obj)
    {
        if(obj == this) return true;
        if(obj == null) return false;
        if(this.getClass() == obj.getClass()){
            BaseFlight other = (BaseFlight)obj;
            return planeType.equals(other.planeType);
        }else{
            return false;
        }
    }

	public int compareTo(BaseFlight o) {
		// TODO Auto-generated method stub
		return this.compareTo(o);
	}
}






