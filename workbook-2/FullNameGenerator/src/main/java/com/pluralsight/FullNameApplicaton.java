package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicaton {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String f = ans("Please enter your first name: ");
        String l = ans("Please enter your last name: ");

        nCheck(f,l);

        String m = ans("Please enter your middle initial: ");
        String s = ans("Please enter a suffix :");

        name(f,l,m,s);
    }
    public static String ans(String message){
        System.out.println(message);
        String answer = scanner.nextLine().trim();
        return answer;
    }

    public static void name(String f, String l, String m, String s){
        String fname = "";
        while(!f.isEmpty() &&!l.isEmpty()){
            fname += f + " ";
            if (!m.isEmpty()){
                fname += m + ". ";
            }
            fname += l;
            if(!s.isEmpty()){
                fname += ", " + s;
            }
            System.out.println(fname);
            f = "";
            l = "";
        }
    }

    public static void nCheck(String f, String l){
        if (l.isEmpty() && f.isEmpty()){
            System.out.println("Please enter both a First and a Last name to continue.");
            System.exit(0);
        }
    }
}
