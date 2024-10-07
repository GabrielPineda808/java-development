package com.pluralsight;
import java.util.Scanner;

public class CellPhone {
    static Scanner s = new Scanner(System.in);
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        System.out.println("What is the serial number? ");
        this.serialNumber = s.nextInt();
        s.nextLine();
        System.out.println("What model is the phone? ");
        this.model = s.nextLine();
        System.out.println("Who is the carrier? ");
        this.carrier = s.nextLine();
        System.out.println("What is the phone number? ");
        this.phoneNumber = s.nextLine();
        System.out.println("Who is the owner of the phone?");
        this.owner = s.nextLine();
    }
    public CellPhone(int serialNumber,String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    public void display() {
        System.out.println(this.serialNumber);
        System.out.println(this.model);
        System.out.println(this.carrier);
        System.out.println(this.phoneNumber);
        System.out.println(this.owner);
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void dial(String phoneNumber){
        System.out.println(this.owner + "'s phone is calling " +phoneNumber);

    }
}
