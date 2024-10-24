package com.pluralsight;

import java.io.IOException;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
            if(roomType.equalsIgnoreCase("king") || roomType.equalsIgnoreCase("double")){
                this.roomType = roomType;
            }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice(){
        if(roomType.equalsIgnoreCase("king")){
            return 139.00*numberOfNights;
        }
        return 124.00*numberOfNights;
    }

    public double getReservationTotal(){
        if(isWeekend){
            return getPrice()*1.10;
        }
        return getPrice();

    }
}
