import java.util.ArrayList;

public class Airline {
    private String airlineName;
    private double profitRate;
    private double costPerClient;
    private ArrayList<Flight> flights;

    public Airline(String airlineName, double profitRate, double costPerClient) {
        this.airlineName = airlineName;
        this.profitRate = profitRate;
        this.costPerClient = costPerClient;
        this.flights = new ArrayList<>();
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

    public void addFlight(Flight f) {
        flights.add(f);
    }
}
