package com.myproject;

public class Room {

    private int roomNumber;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, double price, boolean isBooked){
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void book(){
        isBooked = true;
    }

    public void checkAvailability(int number){
        if(number == roomNumber){
            System.out.println("The room is available.");
        }else{
            System.out.println("The room is not available");
        }
    }

    public double getPrice(){
        return price;
    }




}
