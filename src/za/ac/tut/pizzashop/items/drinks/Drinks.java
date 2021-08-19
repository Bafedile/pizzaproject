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
    }

    @Override
    public double determineItemPrice(String unitSize) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double determineTotalAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
        
        
    
    
}
