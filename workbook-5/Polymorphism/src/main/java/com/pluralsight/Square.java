package com.pluralsight;

public class Square extends Shape{

    double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    public void calculateArea(){
        System.out.println((sideSize*sideSize));
    }
}
