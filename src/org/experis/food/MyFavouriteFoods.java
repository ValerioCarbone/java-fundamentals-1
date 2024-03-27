package org.experis.food;

public class MyFavouriteFoods {
    public static void main(String[] args) {

        // Create an array with my favourite foods
        String[] bestFoodList = {"Pizza", "Pasta", "Bistecca", "Gelato", "Risotto", "Polpette", "Hamburger", "Parmigiana", "Sushi", "Poke"};


        // Stamp the length of the array
        System.out.println(bestFoodList.length);


        // Stamp the most favourite food
        System.out.println(bestFoodList[0]);


        // Stamp my least favourite food
        System.out.println(bestFoodList[bestFoodList.length - 1]);


        // Stamp the food that is in the middle of the list
        System.out.println(bestFoodList[bestFoodList.length / 2]);
    }
}
