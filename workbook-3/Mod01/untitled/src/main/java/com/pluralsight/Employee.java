package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private float hoursWorked;
    private float payRate;

    public Employee(String employeeId, String name, String hoursWorked, String payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = Float.parseFloat(hoursWorked);
        this.payRate = Float.parseFloat(payRate);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public void getGrossPay(){
        System.out.println(this.hoursWorked*this.payRate + "\n");
    }
}
