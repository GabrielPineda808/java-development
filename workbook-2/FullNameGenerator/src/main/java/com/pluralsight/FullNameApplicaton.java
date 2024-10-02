package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicaton {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String f = ans("Please enter your first name: ");
        String l = ans("Please enter your last name: ");
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

        if(!f.isEmpty() && !l.isEmpty()){
            fname += f + " ";
            fname += l + " ";
        }

        System.out.println(fname);
    }
}
