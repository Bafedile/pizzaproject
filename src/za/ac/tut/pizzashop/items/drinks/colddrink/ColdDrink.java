/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.items.drinks.colddrink;

import za.ac.tut.pizzashop.items.drinks.Drinks;

/**
 *
 * @author benov
 */
public class ColdDrink extends Drinks {

    public ColdDrink(){
        super();
    }
    
    public ColdDrink(String unitFlavour,String unitSize,int unitQuantity){
        super(unitFlavour,unitSize,unitQuantity);
        
    }
    
    @Override
    public double determineItemPrice(String unitSize) {
        double price;
        // determine the prices of drinks in their different sizes
               
        if(unitSize.equalsIgnoreCase("small")){
            setUnitSize("440ml");
            price = 11.59;
            
        }else if(unitSize.equalsIgnoreCase("medium")){
            setUnitSize("1.5l");
            price = 17.29;
            
        }else{
            setUnitSize("2l");
            price = 21.99;
        }
        return price;
    }

    
    @Override
    public String toString(){
        return String.format("Drink flavour: %s%n"
                + "Drink size: %s%n"
                + "Drink price: R%.2f%n"
                + "Drinks Total price: R%.2f%n"
                + "Drink quantity: %d%n"
                + "------------------------------------------%n",getUnitFlavour(),getUnitSize(),determineItemPrice(getUnitSize()),determineTotalAmount(),getUnitQuantity());
    }
}
