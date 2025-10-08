import java.time.LocalDateTime;
import java.util.*;

public abstract class Flight {
    private String flightNumber;
    private LocalDateTime departueHour;
    private String boardingGate;
    protected Airport destination;
    protected Airline airline;
    protected Airplane airplane;
    protected ArrayList<Passenger> passengers;

    public Flight(String flightNumber, LocalDateTime departueHour,
                        String boardingGate, Airport destination, Airline airline, Airplane airplane){
        this.flightNumber = flightNumber;
        this.departueHour = departueHour;
        this.boardingGate = boardingGate;
        this.destination = destination;
        this.airline = airline;
        this.airplane = airplane;
        this.passengers = new ArrayList<Passenger>();
    }

    public abstract double getFlightCost();

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public LocalDateTime getDepartureHour() {
        return departueHour;
    }

    public String getBoardingGate(){
        return this.boardingGate;
    }

    public String getAirline(){
        return this.airline.getName();
    }

    public String getAirplane(){
        return this.airplane.getModel();
    }

    public String getDestination(){
        return this.destination.getName();
    }

    public Iterator<Passenger> getPassengers(){
        return passengers.iterator();
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
