package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        try
        {
            System.out.println("Enter the name of the file employee file to process: "); // prompting user to enter a file to read
            String fname = s.nextLine(); // grabbing user input

            System.out.println("Enter the name of the payroll file to create: "); // prompting user file to create
            String cname = s.nextLine(); // saving file creation name

            FileReader fileReader = new FileReader("DataFiles/" + fname); //Reading the file that the user wants to read
            BufferedReader bufReader = new BufferedReader(fileReader); // prelooading all of the file the user chose

            String input; // initializing var that will hold the line that is read
            bufReader.readLine();

            FileWriter fileWriter = new FileWriter(cname); // creating and writing to the file the user wanted csreated
            BufferedWriter bufWriter = new BufferedWriter(fileWriter); //will only write to the file when it is full

            while((input = bufReader.readLine()) != null) { // while there is a line to read

                String[] token = input.split("\\|"); // splitting the file by | to seperate employee attributes

                Employee emp =new Employee(token[0],token[1],token[2],token[3]); //creating a new employee object passing in the data from the split array

                if(cname.contains(".json")){ // if our user wants to create a json file
                    bufWriter.write("{ \"id\" : "+ emp.getEmployeeId() + ", \"name\" : \"" + emp.getName() + "\", \"grossPay\" : " + emp.getGrossPay() + " } , \n"); //BROKEN it will write to the json file
                }else {
                    bufWriter.write(emp.getEmployeeId() + " | " + emp.getName() + " | " + emp.getGrossPay() + "\n"); // format for any other file type
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
