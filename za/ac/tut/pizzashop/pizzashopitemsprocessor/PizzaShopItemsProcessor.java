/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.pizzashopitemsprocessor;

import java.util.List;
import za.ac.tut.pizzashop.items.drinks.Drinks;
import za.ac.tut.pizzashop.items.pizzas.Pizzas;
import za.ac.tut.pizzashop.pizzashopitemsprocessorinterface.PizzaShopItemsProcessorInterface;

/**
 *
 * @author benov
 */
public class PizzaShopItemsProcessor implements PizzaShopItemsProcessorInterface {
    // declare the field members 
//    double totalPizzasAmount = 0, totalDrinksAmount = 0;

    
    // declare the constructor 
    public PizzaShopItemsProcessor(){
        
    }
    @Override
    public void populateThePizzasIntoList(Pizzas pizza, List<Pizzas> pizzas) {
        // add the pizzas to the list
       pizzas.add(pizza);
    }

    @Override 
    public void populateTheDrinksIntoList(Drinks drink, List<Drinks>drinks){
        // add the drinks to the list
        drinks.add(drink);
    }
    
    @Override
    public String getPizzaFlavours(List<Pizzas> pizzas) {
        // Get the pizza flavours from the list
        String pizzaFlavour = null;
        for(Pizzas pizza: pizzas){
            pizza.getUnitFlavour();
        }
        return pizzaFlavour;
    }
    

    @Override
    public String getDrinksFlavours(List<Drinks> drinks) {
        // get the drinks flavour from the list
        String drinksFlavour = null;
        for(Drinks drink: drinks){
            drinksFlavour = drink.getUnitFlavour();
        }
        return drinksFlavour;
    }

    @Override
    public int getPizzaQuantity(List<Pizzas> pizzas) {
        // determine and get the pizza quantity from the list
        int pizzaQuantity = 0;
        for(Pizzas pizza: pizzas){
            pizzaQuantity = pizza.getUnitQuantity();
        }
        
        return pizzaQuantity;
    }

    @Override
    public int getDrinksQuantity(List<Drinks> drinks) {
        // determine and get the drinks quantity from the list
        int drinksQuantity = 0;
        for(Drinks drink: drinks){
            drinksQuantity = drink.getUnitQuantity();
        }
        
        return drinksQuantity;
    }

    @Override
    public double getTotalDrinksAmount(List<Drinks> drinks) {
        double totalDrinksAmount = 0;
        // determine the total amount due for drinks
        for(Drinks drink: drinks){
            totalDrinksAmount += drink.determineTotalAmount();
        }
        
        return totalDrinksAmount;
    }

    @Override
    public double getTotalPizzasAmount(List<Pizzas> pizzas) {
        double totalPizzasAmount = 0;
        // dertermine the total amount due for the pizzas
        for(Pizzas pizza: pizzas){
            totalPizzasAmount += pizza.determineTotalAmount();
        }
        return totalPizzasAmount;
    }

    @Override
    public double getTotalAmountDue(double totalPizzasAmount, double totalDrinksAmount) {
        // dertermine the total amount of the purchase
        double totalAmountDue = totalPizzasAmount + totalDrinksAmount;
        return totalAmountDue;
    }

    @Override
    public String getPizzasFromList(List<Pizzas> pizzas) {
       String message = "";
       
       for(Pizzas pizza: pizzas){
           message += pizza.toString();
       }
       return message;
    }

    @Override
    public String getDrinksFromList(List<Drinks> drinks) {
        String message = "";
        for(Drinks drink: drinks){
            message += drink.toString();
        }
        return message;
    }
    
}
