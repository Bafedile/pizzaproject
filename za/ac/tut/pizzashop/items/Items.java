/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.items;

/**
 *
 * @author benov
 */
public abstract class Items {
    // Declare the field members
    private String unitFlavour,unitSize;
    private  int unitQuantity;
    
    // Declare the default construtor
    public Items(){

        
    }
    
    // Declare the modified constructor
    public Items(String unitFlavour, String unitSize, int unitQuantity){
        // throw a null pointer exception if the unit flavour is initialized as null
        if(unitFlavour == null){
            throw new NullPointerException("Unit flavour can not be null");
        }else{
            this.unitFlavour = unitFlavour;
        }
        
        // throw a null pointer exception if the unit size is initialized as null 
        if(unitSize == null){
            throw new NullPointerException("Unit size can not be null");
        }else{
            this.unitSize = unitSize;
        }
        
        // throw an error if the unit price is less than zero
        if(unitQuantity<0){
            throw new IllegalArgumentException("Unit quantity should be >= 0");
        }else{
            this.unitQuantity = unitQuantity;
        }
    }
    
    // Declare the mutator and accessor methods 
    public void setUnitFlavour(String unitFlavour){
        // throw a null pointer exception if the unit flavour is initialized as null
        if(unitFlavour == null){
            throw new NullPointerException("Unit flavour can not be null");
        }else{
            this.unitFlavour = unitFlavour;
        }
    }
    
    
    public void setUnitQuantity(int unitQuantity){
        // throw an error if the unit price is less than zero
        if(unitQuantity<0){
            throw new IllegalArgumentException("Unit quantity should be >= 0");
        }else{
            this.unitQuantity = unitQuantity;
        }
    }
    
    public void setUnitSize(String unitSize){
        // throw a null pointer exception if the unit size is initialized as null 
        if(unitSize == null){
            throw new NullPointerException("Unit size can not be null");
        }else{
            this.unitSize = unitSize;
        }
    }
    
    // declare the accessor methods
    public String getUnitFlavour(){
        return unitFlavour;
    }
    
    public int getUnitQuantity(){
        return unitQuantity;
    }
    
    public String getUnitSize(){
        return unitSize;
    }
    

        
    
}
