package com.myproject;

public class SuiteRoom extends Room{


    private int extraBeds;

    public SuiteRoom(int roomNumber,double price,boolean isBooked, int extraBeds){
        super(roomNumber,price,isBooked);
        this.extraBeds = extraBeds;

    }
}
