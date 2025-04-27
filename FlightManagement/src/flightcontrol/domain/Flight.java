package flightcontrol.domain;

public class Flight {

    private Airplane airplane;
    private Place departurePlace;
    private Place targetPlace;

    public Flight(Airplane airplane,Place departurePlace, Place targetPlace){
        this.airplane = airplane;
        this.departurePlace = departurePlace;
        this.targetPlace = targetPlace;
    }

    public Place getTargetPlace() {
        return targetPlace;
    }

    public Place getDeparturePlace() {
        return departurePlace;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departurePlace + "-" + this.targetPlace + ")";
    }
}
