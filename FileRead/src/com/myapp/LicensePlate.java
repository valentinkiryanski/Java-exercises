package com.myapp;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof LicensePlate){
            if(this.country.equals(((LicensePlate) object).country) && this.liNumber.equals(((LicensePlate) object).liNumber)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public int hashCode(){
        return liNumber.hashCode() + country.hashCode();
    }
}
