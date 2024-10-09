package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StoreApp {
    public static void main(String[] args) throws IOException {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f \n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() throws IOException {
        ArrayList<Product> inventory = new ArrayList<Product>();
        FileReader s = new FileReader("inventory.csv");
        BufferedReader br = new BufferedReader(s);
        String input;

        while((input = br.readLine()) != null){
            String[] i = input.split("\\|");
            Product n = new Product(Integer.parseInt(i[0]), i[1], Float.parseFloat(i[2]));
            inventory.add(n);

        }
        
// this method loads product objects into inventory
// and its details are not shown
        return inventory;
    }
}
