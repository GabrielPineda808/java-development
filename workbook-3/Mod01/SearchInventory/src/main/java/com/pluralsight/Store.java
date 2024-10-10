package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class Store {
    // the key is the product id, the value is a product object
    static HashMap<String, Product> inventory =
            new HashMap<String, Product>();
    public static void main(String[] args) throws IOException {
// this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item are you interested in? Enter product name:  ");
        String name = scanner.nextLine();
        Product matchedProduct = inventory.get(name);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() throws IOException {
        FileReader s = new FileReader("inventory.csv");
        BufferedReader br = new BufferedReader(s);
        String input;

        while((input = br.readLine()) != null){
            String[] i = input.split("\\|");
            Product n = new Product(Integer.parseInt(i[0]), i[1], Float.parseFloat(i[2]));
            inventory.put(n.getName(),n);
        }

    }
}
