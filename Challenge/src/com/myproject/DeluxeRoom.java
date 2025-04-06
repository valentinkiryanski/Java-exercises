package com.myproject;

public class DeluxeRoom extends Room{


    private int extraBeds;

    public DeluxeRoom(int roomNumber,double price,boolean isBooked, int extraBeds){
        super(roomNumber,price,isBooked);
        this.extraBeds = extraBeds;

    }


}
