public class Passenger {
    private String passengerName;
    private int passengerID;
    private String nationality;

    public Passenger(String passengerName, int passengerID, String nationality) {
        this.passengerName = passengerName;
        this.passengerID = passengerID;
        this.nationality = nationality;
    }

    public String getName() { 
        return passengerName; 
    }
    public int getPassengerID() { 
        return passengerID; 
    }
    public String getNationality() { 
        return nationality; 
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
