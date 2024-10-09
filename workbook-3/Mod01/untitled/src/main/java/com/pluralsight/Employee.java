package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String hoursWorked;
    private String payRate;

    public Employee(String employeeId, String name, String hoursWorked, String payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return Integer.parseInt(employeeId);
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
        return Float.parseFloat(hoursWorked);
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return Float.parseFloat(payRate);
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public float getGrossPay(){
        return Float.parseFloat(this.hoursWorked)*Float.parseFloat(this.payRate);
    }
    public String display(){
        int i = this.getEmployeeId();
        String n = this.getName() + " ";

        return i+ " " + n +" "+ getPayRate();
    }
}
