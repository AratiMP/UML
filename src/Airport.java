import java.util.*;

public class Airport {
    private String airportName;
    private double refuelTax;
    private String city;
    private String country;
    private ArrayList<Flight> flights;

    public Airport(String airportName, double refuelTax, String city, String country) {
        this.airportName = airportName;
        this.refuelTax = refuelTax;
        this.city = city;
        this.country = country;
        this.flights = new ArrayList<Flight>();
    }

    public String getName() { 
        return airportName; 
    }
    public double getRefuelTax() { 
        return refuelTax; 
    }
    public String getCity() { 
        return city; 
    }
    public String getCountry() { 
        return country; 
    }
    public Iterator<Flight> getFlights() { return flights.iterator();}

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setRefuelTax(double refuelTax) {
        this.refuelTax = refuelTax;
    }

}
