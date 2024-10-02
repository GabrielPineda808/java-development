package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicaton {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String f = ans("Please enter your first name: ");
        nCheck(f,"Please enter a first name in order to continue with the program. ");

        String l = ans("Please enter your last name: ");
        nCheck(l,"Please enter a last name in order to continue with the program. ");

        String m = ans("Please enter your middle name: ");
        String s = ans("Please enter a suffix :");

        name(f,l,m,s);
    }
    public static String ans(String message){
        System.out.println(message);
        return scanner.nextLine().trim();
    }

    public static void name(String f, String l, String m, String s){
        String fname = "";
        fname += f + " ";
        if (!m.isEmpty()){
            fname += m.charAt(0) + ". ";
        }
        fname += l;
        if(!s.isEmpty()){
            fname += ", " + s;
        }
        System.out.println(fname);
    }

    public static void nCheck(String x, String message){
        if (x.isEmpty()){
            System.out.println(message);
            System.exit(0);
        }
    }
}
