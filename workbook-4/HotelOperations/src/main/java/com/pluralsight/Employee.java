package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularPay(){
        return getRegularHours()*payRate;
    }

    public double getOvertimePay(){
        return getOvertimeHours()*(payRate*1.5);
    }

    public double getRegularHours(){
        if (hoursWorked <=40 && hoursWorked >0){
            return hoursWorked;
        }
        return 0;
    }

    public double getOvertimeHours(){
        if(hoursWorked>40){
            return hoursWorked - 40;
        }
        return 0;
    }

    public double punchIn(double time){
        return time;
    }

    public double punchIn(){
        int hours = LocalDateTime.now().getHour();
        double minutes = (double) LocalDateTime.now().getMinute()/100;
        return hours+minutes;
    }

    public void punchOut(double punchIn,double time){

        hoursWorked += Math.abs(punchIn-time);
    }

    public double punchOut(){
        int hours = LocalDateTime.now().getHour();
        double minutes = (double) LocalDateTime.now().getMinute()/100;
        return hours+minutes;
    }

    public void punchTimeCard(){
        setHoursWorked((Math.abs(punchIn()- punchOut())));
    }
}
