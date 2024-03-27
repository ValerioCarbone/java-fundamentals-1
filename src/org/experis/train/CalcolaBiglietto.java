package org.experis.train;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti km vuoi percorrere?");

        int km = Integer.parseInt(scan.nextLine());

        System.out.println("Quanti anni hai?");

        int age = Integer.parseInt(scan.nextLine());

        double price = km * 0.21;

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
        System.out.println(finalPrice);
        scan.close();
    }
}
