/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.pizzashopitemsprocessorinterface;

import java.util.List;
import za.ac.tut.pizzashop.items.drinks.Drinks;
import za.ac.tut.pizzashop.items.pizzas.Pizzas;

/**
 *
 * @author benov
 */
public interface PizzaShopItemsProcessorInterface {
    // declare the abstract methods
    public void populateThePizzasIntoList(Pizzas pizza,List<Pizzas> pizzas);
    public String getPizzasFromList(List<Pizzas>pizzas);
    public String getDrinksFromList(List<Drinks>drinks);
    public void populateTheDrinksIntoList(Drinks drink, List<Drinks> drinks);
    public String getPizzaFlavours(List<Pizzas> pizzas);
    public String getDrinksFlavours(List<Drinks> drinks);
    public int getPizzaQuantity(List<Pizzas> pizzas);
    public int getDrinksQuantity(List<Drinks> drinks);
    public double getTotalDrinksAmount(List<Drinks> drinks);
    public double getTotalPizzasAmount(List<Pizzas>pizzas);
    public double getTotalAmountDue(double totalPizzasAmount,double totalDrinksAmount);
}
