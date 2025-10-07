import java.time.LocalDateTime;
import java.util.*;

public class IndirectFlight extends Flight {
    private boolean boardingAtTransitAirport;
    private ArrayList<Airport> transitAirports;

    public IndirectFlight(String flightNumber, LocalDateTime departureHour,
                                String boardingGate, Airport destination, Airline airline, Airplane airplane){
        super(flightNumber, departureHour, boardingGate, destination, airline, airplane);
        this.boardingAtTransitAirport = false;
        this.transitAirports = new ArrayList<Airport>();
    }
    @Override
    public double getFlightCost(){
        return 0.0;
    }

    public Iterator<Airport> getTransitAirports(){
        return transitAirports.iterator();
    }

    public void setBoardingAtTransitionAirport(){
        this.boardingAtTransitAirport = true;
    }

}
