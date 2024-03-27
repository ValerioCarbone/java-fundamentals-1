package org.experis.train;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {

        // Start the Scanner
        Scanner scan = new Scanner(System.in);


        // Ask age and km to travel
        System.out.println("How many km you have to travel?");

        int km = Integer.parseInt(scan.nextLine());

        System.out.println("How old are you?");

        int age = Integer.parseInt(scan.nextLine());


        // Calculate the price x km
        double price = km * 0.21;


        // If the condition  occur, apply the discount.
        double finalPrice;

        if(age < 18) {
            finalPrice = price - (price * 0.2);
        }
        else if (age >= 65) {
            finalPrice = price - (price * 0.4);
        }
        else{
            finalPrice = price;
        }


        // Stamp the final price
        System.out.println(finalPrice);



        // Close the scan
        scan.close();
    }
}
