package com.pluralsight;
import java.util.Scanner;

public class CellPhone {
    static Scanner s = new Scanner(System.in);
    private final int serialNumber;
    private final String model;
    private final String carrier;
    private final String phoneNumber;
    private final String owner;

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
    public static void display(CellPhone phone) {
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
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
