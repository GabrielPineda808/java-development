package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int serialNumber = Integer.parseInt(ans("What is the serial number? "));
        String model = ans("What model is the phone? ");
        String carrier= ans("Who is the carrier? ");
        String phoneNumber= ans("What is the phone number? ");
        String owner = ans("Who is the owner of the phone?");

        CellPhone phone = new CellPhone(serialNumber,model,carrier,phoneNumber,owner);

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
        




    }

    public static String ans(String m){
        System.out.println(m);
        return s.nextLine().trim();
    }

}
