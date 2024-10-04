package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        CellPhone phone2 = new CellPhone();

        CellPhone.display(phone);
        phone.dial( phone2.getPhoneNumber());
        phone2.dial(phone.getPhoneNumber());
    }

    public static String ans(String m){
        System.out.println(m);
        return s.nextLine().trim();
    }


}
