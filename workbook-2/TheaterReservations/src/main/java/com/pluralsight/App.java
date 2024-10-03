package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class App {
    static Scanner s = new Scanner(System.in);
    public static void main( String[] args ) {
        String name = ans("Please enter your first and last name: ");
        String date = ans("Please enter the date that you will be coming (MM/DD/YYYY): ");
        String ticket = ans("Please enter the amount of tickets you will be purchasing: ");

        reservation(nameF(name),format(date), amount(ticket));
    }

    public static String ans(String m) {
        System.out.println(m);
        return s.nextLine().trim();
    }

    public static String nameF(String n){
        String[] s = n.split("\\s+");
        String lf = "";

        lf += s[1] + ", ";
        lf+= s[0];

        return lf;
    }

    public static LocalDate format(String d) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate t = LocalDate.parse(d,df);
        return t;
    }

    public static int amount(String t){
        int x = Integer.parseInt(t);
        return x;
    }

    public static void reservation(String n, LocalDate d, int x){
        if(x==1) {
            System.out.println(x + " ticket reserved for " + d + " under " + n);
        }else {
            System.out.println(x + " tickets reserved for " + d + " under " + n);
        }
    }

}
