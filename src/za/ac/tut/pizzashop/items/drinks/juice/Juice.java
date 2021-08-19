/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.items.drinks.juice;

import za.ac.tut.pizzashop.items.drinks.Drinks;
import za.ac.tut.pizzashop.itemsinterface.ItemsInterface;

/**
 *
 * @author benov
 */
public class Juice extends Drinks {

    public Juice(){
        super();
    }
    
    public Juice(String unitFlavour,String unitSize,int unitQuantity){
        super(unitFlavour,unitSize,unitQuantity);
    }
    @Override
    public double determineItemPrice(String unitSize) {
        double price;
        if(unitSize.equalsIgnoreCase("small")){
            setUnitSize("440ml");
            price = 10.23;
            
        }else if(unitSize.equalsIgnoreCase("medium")){
            setUnitSize("1l");
            price = 14.39;
        }else{
            setUnitSize("1.5l");
            price = 19.43;
        }
           
        return price;
    }

    @Override
    public double determineTotalAmount() {
        return determineItemPrice(getUnitSize()) * getUnitQuantity();
    }
    
    
    @Override
    public String toString(){
        return String.format("Drink flavour: %s%n"
                + "Drink size: %s%n"
                + "Drink prize: R%.2f%n"
                + "Drink quantity: %d%n"
                + "------------------------------------------%n",getUnitFlavour(),getUnitSize(),determineTotalAmount(),getUnitQuantity());
    }
    
}
