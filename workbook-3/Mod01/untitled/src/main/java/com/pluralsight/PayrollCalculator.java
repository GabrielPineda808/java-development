package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        try
        {
            System.out.println("Enter the name of the file employee file to process: ");
            String fname = s.nextLine();

            System.out.println("Enter the name of the payroll file to create: ");
            String cname = s.nextLine();

            FileReader fileReader = new FileReader("DataFiles/" + fname);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            String heading = bufReader.readLine();

            FileWriter fileWriter = new FileWriter(cname);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            while((input = bufReader.readLine()) != null) {
                String[] token = input.split("\\|");
                Employee emp =new Employee(token[0],token[1],token[2],token[3]);
                if(cname.contains(".json")){
                    bufWriter.write("{ \"id\" : "+ emp.getEmployeeId() + ", \"name\" : \"" + emp.getName() + "\", \"grossPay\" : " + emp.getGrossPay() + " } , \n");
                }else {
                    bufWriter.write(emp.getEmployeeId() + " | " + emp.getName() + " | " + emp.getGrossPay() + "\n");
                }
            }
            bufReader.close();
            bufWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
