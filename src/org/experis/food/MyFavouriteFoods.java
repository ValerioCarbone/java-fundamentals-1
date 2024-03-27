package org.experis.food;

public class MyFavouriteFoods {
    public static void main(String[] args) {
        String[] bestFoodList = {"Pizza", "Pasta", "Bistecca", "Gelato", "Risotto", "Polpette", "Hamburger", "Parmigiana", "Sushi", "Poke"};

        System.out.println(bestFoodList.length);
        System.out.println(bestFoodList[0]);
        System.out.println(bestFoodList[bestFoodList.length - 1]);
        System.out.println(bestFoodList[bestFoodList.length / 2]);
    }
}
