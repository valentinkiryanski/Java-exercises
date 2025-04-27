package flightcontrol.logic;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import flightcontrol.domain.Airplane;
import flightcontrol.domain.Flight;
import flightcontrol.domain.Place;

public class FlightControl {
    private HashMap<String,Flight> flights;
    private AirportAsset as;

    public FlightControl(AirportAsset as){
        this.flights = new HashMap<>();
        this.as = as;
    }


    public void printAirplanes(){
        for(Airplane a : this.as.getPlanes()){
            System.out.println(a);
        }
    }

    public void printFlights(){
        for(Flight f : this.as.getFlights().values()){
            System.out.println(f);
        }
    }

    public void printAirplaneDetails(String name){
        for(Airplane a : this.as.getPlanes()){
            if(a.getId().equals(name)){
                System.out.println(a);
            }
        }
    }


}
