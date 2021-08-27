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

//    @Override
//    public double determineTotalAmount() {
//        if(getUnitSize().equalsIgnoreCase("large") && getUnitQuantity()>=2){
//            return determineItemPrice(getUnitSize()*getUnitQuantity()*(discount));
//        }else{
//            return determineItemPrice(getUnitSize()) * getUnitQuantity();
//        }
//        
//    }
    
    @Override 
    public String toString(){
        return super.toString();
    }
//   
    
}
