import java.util.*;

public class Airline {

    private String airlineName;
    private double profitRate;
    private double costPerClient;
    private ArrayList<Flight> flights;

    public Airline(String airlineName, double profitRate, double costPerClient) {
        this.airlineName = airlineName;
        this.profitRate = profitRate;
        this.costPerClient = costPerClient;
        this.flights = new ArrayList<Flight>();
    }

    public String getName() { 
        return airlineName; 
    }
    public double getProfitRate() { 
        return profitRate; 
    }
    public double getCostPerClient() { 
        return costPerClient; 
    }
    public Iterator<Flight> getFlights() { return flights.iterator();}

    public void setAirlineName(String airlineName) {this.airlineName = airlineName;}
    public void setProfitRate(double profitRate) {this.profitRate = profitRate;}
    public void setCostPerClient(double costPerClient) {this.costPerClient = costPerClient;}

}
