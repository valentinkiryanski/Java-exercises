package flightcontrol.logic;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import flightcontrol.domain.Airplane;
import flightcontrol.domain.Flight;
import flightcontrol.domain.Place;

public class AirportAsset {

    private ArrayList<Airplane> planes;
    private HashMap<String,Flight> flights;

    public AirportAsset(){
        this.planes = new ArrayList<>();
        this.flights = new HashMap<>();
    }

    public ArrayList<Airplane> getPlanes() {
        return planes;
    }

    public HashMap<String, Flight> getFlights() {
        return flights;
    }

    public void addAirplane(Airplane airplane){
        planes.add(airplane);
    }

    public void addFlight(String id,String dep, String dest){

        for(Airplane plane : planes){
            if(plane.getId().equals(id)){
                flights.put(dep,new Flight(plane,new Place(dep), new Place(dest)));
            }
        }
    }
}