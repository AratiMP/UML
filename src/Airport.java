import java.util.ArrayList;

public class Airport {
    private String airportName;
    private double refuelTax;
    private String city;
    private String country;

    public Airport(String airportName, double refuelTax, String city, String country) {
        this.airportName = airportName;
        this.refuelTax = refuelTax;
        this.city = city;
        this.country = country;
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
}
