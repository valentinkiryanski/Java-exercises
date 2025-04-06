package com.myproject;

public class Reservation {

    private String guestName;
    private String roomType;

    private int days;

    public Reservation(String guestName, String roomType,int days){
        this.guestName = guestName;
        this.roomType = roomType;
        this.days = days;
    }

    public double getTotalCost(Room room){
        double cost;
        if(roomType.equalsIgnoreCase((room.getClass().getSimpleName()))){
             cost = room.getPrice() * days;
             return cost;
        }else{
            return cost = 0;
        }
    }

}
