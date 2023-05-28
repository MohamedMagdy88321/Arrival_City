package test1;
import java.util.*;
import java.io.*; 
public class Airways {
    private String name;
    private ArrayList<Flight>flights;
public Airways(String name){
    this.name=name;
    flights=new ArrayList<>();
}
public void addFlight(Flight o ){
    if(!(flights.contains(o))){
        flights.add(o);
        System.out.println("the personal Arrival City  ");
    }
    else{
        System.out.println("itis Aryeads Exsist");
    }
}
public int arrivalFrequency(String arrival_city){
    int counter=0;
for(Flight m :flights ){
    if(m.getArrival_city().equals(arrival_city)){
        counter++;
    }
}
return counter;
}
public void saveintoFile(String file){
    try{
    File f=new File(file);
    PrintWriter bw=new PrintWriter(f);
    bw.println(this.name);
    Collections.sort(flights);
    for(int i=0; i<flights.size();i++ ){
        bw.println(flights.get(i).toString());
    }
    bw.close();
    }
catch(FileNotFoundException e){
    System.out.println("Error : "+e);
}
}

}
