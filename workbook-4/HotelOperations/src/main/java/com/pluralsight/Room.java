package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private float price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, float price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable(){
        return (isDirty && isOccupied);
    }

    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut(){
        this.isOccupied = false;
        cleanRoom();
    }

    public void cleanRoom(){
        this.isDirty = false;
    }
}
