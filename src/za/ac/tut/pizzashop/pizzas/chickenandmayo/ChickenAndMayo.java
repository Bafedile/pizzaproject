/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.pizzas.chickenandmayo;

import za.ac.tut.pizzashop.items.pizzas.Pizzas;
import za.ac.tut.pizzashop.itemsinterface.ItemsInterface;

/**
 *
 * @author benov
 */
public class ChickenAndMayo extends Pizzas {

    public ChickenAndMayo(){
        super();
    }
    
    public ChickenAndMayo(String unitFlavour,String unitSize,int unitQuantity){
        super(unitFlavour,unitSize,unitQuantity);
    }
    
    @Override
    public double determineItemPrice(String unitSize) {
        
        double price;
         if(unitSize.equalsIgnoreCase("small")){
             price = 31.99;
         }else if(unitSize.equalsIgnoreCase("medium")){
             price = 56.0;
         }else{
             price = 72.5;
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
