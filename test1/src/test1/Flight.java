package test1;
import java.util.*;
import java.io.*;
public  class Flight implements Comparable<Flight>{
    private int flight_number;
    private String departure_city;
    private String arrival_city;

    public Flight() {
    }

    public Flight(int flight_number, String departure_city, String arrival_city) {
        this.flight_number = flight_number;
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    @Override
    public String toString() {
        return "Flight{" + "flight_number=" + flight_number + ", departure_city=" + departure_city + ", arrival_city=" + arrival_city + '}';
    }
    
    @Override
   public boolean equals(Object c ){
       if(!(c instanceof Flight)){
           return false;
       }
       Flight fli=((Flight)c);
   if(this.flight_number==fli.flight_number && this.departure_city.equals(fli.departure_city) && this.arrival_city.equals(fli.arrival_city)){
       return true;
   }
   else {
       return false;
   }
   }

    @Override
    public int compareTo(Flight o) {
    return this.arrival_city.compareTo(o.arrival_city);
    }

}
