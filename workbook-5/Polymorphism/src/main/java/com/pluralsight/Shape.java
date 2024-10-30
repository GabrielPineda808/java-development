package com.pluralsight;

public class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calculateArea(){
        System.out.println("Calculate Area");
    }

    public void calculateCircumference(){
        System.out.println("Calculate Circumference");
    }
}
