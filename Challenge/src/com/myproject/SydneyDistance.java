package com.myproject;
import java.util.LinkedList;

public class SydneyDistance {

    private String townName;
    private int distanceFromSydney;

    public SydneyDistance(String townName, int distanceFromSydney){
        this.townName = townName;
        this.distanceFromSydney = distanceFromSydney;
    }

    @Override
    public String toString() {
        return "SydneyDistance{" +
                "townName='" + townName + '\'' +
                ", distanceFromSydney=" + distanceFromSydney +
                '}';
    }

    public void setTownName(String townName){
        this.townName = townName;
    }

    public void setDistanceFromSydney(int distanceFromSydney){
        this.distanceFromSydney = distanceFromSydney;
    }

    public String getTownName(){
        return townName;
    }

    public int getDistanceFromSydney(){
        return distanceFromSydney;
    }

}
