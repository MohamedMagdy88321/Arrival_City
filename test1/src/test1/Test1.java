package test1;
import java.util.*;
import java.io.*;
public class Test1 {
    public static void main(String[] args) {
    Airways myAirways=new Airways("Kuwait Airways");
     Flight f=new Flight(1, "Kuwait ","Amman");
     Flight f1=new Flight(1235, "Cairo ","Mohamed");
    myAirways.addFlight(f);
    myAirways.addFlight(f1);
    myAirways.arrivalFrequency("Ciaro");
    myAirways.saveintoFile("");
    }
    
}
