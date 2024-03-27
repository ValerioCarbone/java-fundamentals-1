package org.experis.ferragnez;

import java.util.Scanner;

public class FestaFerragnez {
    public static void main(String[] args) {

        // Star the scan
        Scanner scan = new Scanner(System.in);


        // Create an array with the guests name
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


        // Ask the name of the person
        System.out.println("What's your name?");


        // Save the name in a variable
        String personAtTheDoor = scan.nextLine();


        // Initialize a boolean to check if there is a match with the guests list
        boolean isInTheList = false;


        /* Cycle the guests list to check the name of the person at the door
       for (int i = 0; i < guests.length; i++) {

            if (guests[i].equalsIgnoreCase(personAtTheDoor) ) {

               // If there is a match, print the positive message and break the loop
                isInTheList = true;
                System.out.println("You're in!");
                break;
            }

        } */


        // Alternative for loop (for each)

        for (String guest : guests) {
            if (guest.equalsIgnoreCase(personAtTheDoor)) {

                isInTheList = true;
                System.out.println("You're in!");
                break;
            }
        }


        // If there was no match print the negative message
        if (!isInTheList) {
            System.out.println("Your're not in the list. Go away!");
        }
    }
}
