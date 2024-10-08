package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        try
        {
            FileReader fileReader = new FileReader("DataFiles/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            String heading = bufReader.readLine();
            while((input = bufReader.readLine()) != null) {
                String[] token = input.split("\\|");
                Employee emp =new Employee(token[0],token[1],token[2],token[3]);
                System.out.printf(emp.getEmployeeId() + " ");
                System.out.printf(emp.getName() + " ");
                emp.getGrossPay();
            }
            bufReader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
