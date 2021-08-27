/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.items.pizzas;

import za.ac.tut.pizzashop.items.Items;
import za.ac.tut.pizzashop.itemsinterface.ItemsInterface;

/**
 *
 * @author benov
 */
public class Pizzas extends Items  implements ItemsInterface{
    double discount=determineItemPrice(getUnitSize())*getUnitQuantity()*0.12;
    
    // declare the default constructor 
    public Pizzas(){
        super();
        
    }
    
    // declare the modified constuctor
    public Pizzas(String unitFlavour,String unitSize,int unitQuantity){
        super(unitFlavour,unitSize,unitQuantity);
    }

    @Override
    public double determineItemPrice(String unitSize) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
     public double determineTotalAmount() {
       
            return determineItemPrice(getUnitSize()) * getUnitQuantity();
        
        
    }
      @Override
    public String toString(){
        double totalAmountDue = 0;
        if(getUnitSize().equalsIgnoreCase("large") && getUnitQuantity()>=2){
            totalAmountDue = determineItemPrice(getUnitSize())*getUnitQuantity() - discount;
            
            return String.format("---------------------------------%n"
                + "Pizza flavour: %s%n"
                + "Pizza size: %s%n"
                + "Pizza price: R%.2f  each%n"
                + "Pizza Discount : R%.2f%n"
                + "Pizzas Total Price: R%.2f%n"
                
                + "Pizza quantity: %d%n"
                + "------------------------------------------%n",getUnitFlavour(),
                getUnitSize(),determineItemPrice(getUnitSize()),discount,
                totalAmountDue,getUnitQuantity());
        }else{
            totalAmountDue = determineTotalAmount();
            return String.format("---------------------------------%n"
                + "Pizza flavour: %s%n"
                + "Pizza size: %s%n"
                + "Pizza price: R%.2f  each%n"
                + "Pizzas Total Price: R%.2f%n"
                
                + "Pizza quantity: %d%n"
                + "------------------------------------------%n",getUnitFlavour(),
                getUnitSize(),determineItemPrice(getUnitSize()),
                totalAmountDue,getUnitQuantity());
        }
        
    }
    
}
