package com.myproject;

public class StandardRoom extends Room{

    private String miniBar;

    public StandardRoom(int roomNumber,double price,boolean isBooked, String miniBar){
        super(roomNumber,price,isBooked);
        this.miniBar = miniBar;

    }
}
