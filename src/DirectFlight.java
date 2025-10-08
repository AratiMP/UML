import java.time.LocalDateTime;

public class DirectFlight extends Flight {
    public DirectFlight(String flightNumber, LocalDateTime departueHour, String boardingGate, Airport destination, Airline airline, Airplane airplane) {
        super(flightNumber, departueHour, boardingGate, destination, airline, airplane);
    }

    @Override
    public double getFlightCost(){
        return super.airline.getCostPerClient() + (1 * super.airline.getProfitRate());
    }
}
