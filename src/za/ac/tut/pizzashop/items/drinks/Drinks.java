/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.items.drinks;

import za.ac.tut.pizzashop.items.Items;
import za.ac.tut.pizzashop.itemsinterface.ItemsInterface;

/**
 *
 * @author benov
 */
public class Drinks extends Items  implements ItemsInterface{
    
    // declare the default constructor
    public Drinks(){
        super();
    }
    
    
    
    public Drinks(String unitFlavour,String unitSize,int unitQuantity){
        super(unitFlavour,unitSize,unitQuantity);
        if(unitSize == "440ml"){
            unitSize = "small";
        }else if(unitSize =="1.5l"){
            unitSize = "medium";
        }else if(unitSize =="2l"){
            unitSize ="large";
        }
        
        
    }

    @Override
    public double determineItemPrice(String unitSize) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double determineTotalAmount() {
        return determineItemPrice(getUnitSize()) * getUnitQuantity();
    }
    

   
        
        
    
    
}
