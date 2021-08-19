/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.itemsinterface;

/**
 *
 * @author benov
 */

public interface ItemsInterface {
    // declare the methods
    public double determineItemPrice(String unitSize);
    public double determineTotalAmount();
}
