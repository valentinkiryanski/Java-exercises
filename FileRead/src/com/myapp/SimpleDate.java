package com.myapp;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof SimpleDate){
            if(this.day == ((SimpleDate) object).getDay() && this.month == ((SimpleDate) object).month && this.year == ((SimpleDate) object).year){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.year + (this.month/2 + 1) + this.day;
    }
}
