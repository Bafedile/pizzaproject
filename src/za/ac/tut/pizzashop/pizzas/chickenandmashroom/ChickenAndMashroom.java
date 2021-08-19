/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.pizzas.chickenandmashroom;

import za.ac.tut.pizzashop.items.pizzas.Pizzas;
import za.ac.tut.pizzashop.itemsinterface.ItemsInterface;

/**
 *
 * @author benov
 */
public class ChickenAndMashroom extends Pizzas {
    public ChickenAndMashroom(){
        super();
    }
    
    public ChickenAndMashroom(String unitFlavour,String unitSize,int unitQuantity){
        super(unitFlavour,unitSize,unitQuantity);
    }

    @Override
    public double determineItemPrice(String unitSize) {
            double price;
        
        // determine a price for different pizza flavours and their sizes 
         if(unitSize.equalsIgnoreCase("small")){
                price = 29.30;
         }else if(unitSize.equalsIgnoreCase("medium")){
                price = 52.0;
         }else{
                price = 68.5;
        }
         return price;
    }

    @Override
    public double determineTotalAmount() {
        return determineItemPrice(getUnitSize()) * getUnitQuantity();

    }
    
    @Override
    public String toString(){
        return String.format("Pizza flavour: %s%n"
                + "Pizza size: %s%n"
                + "Pizza prize: R%.2f%n"
                + "Pizza quantity: %d%n"
                + "------------------------------------------%n",getUnitFlavour(),getUnitSize(),determineTotalAmount(),getUnitQuantity());
    }
        
}
