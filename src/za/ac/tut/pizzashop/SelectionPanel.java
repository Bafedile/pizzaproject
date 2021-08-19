/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import javax.swing.border.LineBorder;
import za.ac.tut.pizzashop.items.drinks.Drinks;
import za.ac.tut.pizzashop.items.drinks.colddrink.ColdDrink;
import za.ac.tut.pizzashop.items.drinks.juice.Juice;
import za.ac.tut.pizzashop.items.extrasinterface.ExtrasInterface;
import za.ac.tut.pizzashop.items.pizzas.Pizzas;
import za.ac.tut.pizzashop.pizzas.beefandcheese.BeefAndCheese;
import za.ac.tut.pizzashop.pizzas.chickenandmashroom.ChickenAndMashroom;
import za.ac.tut.pizzashop.pizzas.chickenandmayo.ChickenAndMayo;
import za.ac.tut.pizzashop.pizzashopitemsprocessor.PizzaShopItemsProcessor;

/**
 *
 * @author benov
 */
public class SelectionPanel extends JPanel implements ActionListener,ExtrasInterface {
    // declare the buttons and check boxes

    String pizzaArray[] = {"None","Chicken And Mashroom","Chicken And Mayo","Beef And Cheese"};
    String drinkArray[] = {"None","Cold-drink","Juice"};
    String sizes[] = {"None","Small","Medium","Large"};
    
    static JComboBox pizzaBox;
    static JComboBox drinksBox;
    static JComboBox sizesBox;
    static JComboBox drinkSizesBox;
    JCheckBox extraBox1;
    JCheckBox extraBox2;
    
    
    JTextField pizza_quantity_text;
    JTextField drink_quantity_text;
    JButton pizza_quantity_button;
    JButton drink_quantity_button;
    static JButton exitButton = new JButton("Exit");
    JLabel label = new JLabel("Item Selection");
    JLabel pizzaSelection = new JLabel("Select a pizza");
    JLabel drinkSelection = new JLabel("Select a drink");
    JLabel drinkSizeSelection  = new JLabel("Select drink size");
    JLabel sizeSelection = new JLabel("Select size");
    
    
    JLabel extrasSelection = new JLabel("Choose extras");
    JLabel pizza_quantity_label = new JLabel("Enter Drink Quantity Below");
    JLabel drink_quantity_label = new JLabel("Enter Drink Quantity Below");
    
    JButton addButton = new JButton("Add");
    JButton doneButton = new JButton("Done");
    JButton nextButton = new JButton("Next");
    
    List<Pizzas> pizzas = new ArrayList<>();
    List<Drinks> drinks = new ArrayList<>();
    
    static List<Pizzas> pizzasSummary = new ArrayList<>();
    static List<Drinks> drinksSummary = new ArrayList<>();
    PaymentSection paymentSection = new PaymentSection();
    public SelectionPanel(){
//        this.setLayout(new FlowLayout());
        this.setLayout(null);
        
        // set the border 
        this.setBorder(new LineBorder(Color.BLACK));

        // set the bounds of the panel 
        this.setBounds(0,250,500,400);
//        this.setBackground(Color.magenta);
        
        
        //set label 
        this.label.setBounds(200,0,200,10);
        
        
        // set the pizza combobox
        this.pizzaSelection.setBounds(5,20,200,20);
        this.pizzaBox = new JComboBox();
        for(int i=0;i<pizzaArray.length;i++){
            this.pizzaBox.addItem(pizzaArray[i]);
        }
        this.pizzaBox.setBounds(5,40,200,30);
        
        
        // set the drinks combo box
        this.drinkSelection.setBounds(250,20,200,20);
        this.drinksBox = new JComboBox();
        for(int i=0;i<drinkArray.length;i++){
            this.drinksBox.addItem(drinkArray[i]);
        }
        this.drinksBox.setBounds(250,40,200,30);
        
        
        // set the size 
        this.sizeSelection.setBounds(5,100,200,20);
        
        this.sizesBox = new JComboBox();
        for(int i=0;i<sizes.length;i++){
            this.sizesBox.addItem(sizes[i]);
        }
        this.sizesBox.setBounds(5,120,200,30);
        
        
        // set the extras combo box
        this.extrasSelection.setBounds(5,180,200,20);
        this.extraBox1 = new JCheckBox();
        this.extraBox1.setText("Cheese");
        this.extraBox2 = new JCheckBox();
        this.extraBox2.setText("Bacon");
        
        this.extraBox1.setBounds(5,200,95,30);
        this.extraBox2.setBounds(100,200,100,30);
            
        
        
        // set the quantity selection
        this.drink_quantity_label.setBounds(250,80,200,20);
        this.drink_quantity_button = new JButton("Send");
        this.drink_quantity_button.setBounds(350,100,90,20);
        this.drink_quantity_text = new JTextField();
        this.drink_quantity_text.setBounds(250,100,90,20);
        
        // set the drink size
        this.drinkSizeSelection.setBounds(250,140,200,20);
        
        this.drinkSizesBox = new JComboBox();
        for(int i=0;i<sizes.length;i++){
            this.drinkSizesBox.addItem(sizes[i]);
        }
        this.drinkSizesBox.setBounds(250,160,200,30);
        
        
        this.pizza_quantity_label.setBounds(5,250,200,20);
        this.pizza_quantity_text = new JTextField();
        this.pizza_quantity_text.setBounds(5,285,100,30);
        this.pizza_quantity_button = new JButton("Send");
        this.pizza_quantity_button.setBounds(110,285,90,30);
        
        
        // set the adding button 
        this.addButton.setBounds(5,330,90,30);
        this.doneButton.setBounds(110,330,90,30);
        this.nextButton.setBounds(110,370,90,30);
        this.exitButton.setBounds(5,370,90,30);
        
        // add the features
        this.add(doneButton);
        this.add(exitButton);
        this.add(nextButton);
        this.add(pizzaBox);
        this.add(drinksBox);
        this.add(extraBox1);
        this.add(extraBox2);
        this.add(addButton);
        this.add(sizesBox);
        this.add(pizza_quantity_label);
        this.add(pizza_quantity_text);
        this.add(pizza_quantity_button);
        this.add(drink_quantity_button);
        this.add(drink_quantity_text);
        this.add(drink_quantity_label);
        this.add(label);
        this.add(paymentSection);
        this.add(pizzaSelection);
        this.add(drinkSelection);
        this.add(drinkSizesBox);
        this.add(sizeSelection);
        this.add(extrasSelection);
        this.add(drinkSizeSelection);
        
        this.setOpaque(true);
        this.setVisible(true);
        
        
        // Add to action listener
        pizzaBox.addActionListener(this);
        drinksBox.addActionListener(this);
        
        extraBox1.addActionListener(this);
        extraBox2.addActionListener(this);
        
        addButton.addActionListener(this);
        sizesBox.addActionListener(this);
        doneButton.addActionListener(this);
        nextButton.addActionListener(this);
        pizza_quantity_button.addActionListener(this);
        drink_quantity_button.addActionListener(this);
        
        drinkSizesBox.addActionListener(this);
        PaymentSection.paymentButton.addActionListener(this);
        
    }

    // Declare variables
    String pizzaFlavour,pizzaSize,drinkFlavour,drinkSize;
    int pizzaQuantity,drinkQuantity;
    double totalAmountDue, totalPizzasAmount,totalDrinksAmount;
    String message;
    ItemTrackPanel it = new ItemTrackPanel();
    
    
    
    PizzaShopItemsProcessor ip = new PizzaShopItemsProcessor();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(pizzaBox == source){
            pizzaFlavour = (String) pizzaBox.getSelectedItem();
            
        }
        
        if(drinksBox == source){
            drinkFlavour = (String) drinksBox.getSelectedItem();
            
        }
        
        if(pizza_quantity_button==source){
            // convert text into integer
            pizzaQuantity = Integer.parseInt(pizza_quantity_text.getText());
            pizza_quantity_text.setText("");
        }
        
        if(drink_quantity_button == source){
            drinkQuantity = Integer.parseInt(drink_quantity_text.getText());
            drink_quantity_text.setText("");
        }
        
        if(sizesBox == source){
            pizzaSize = (String)sizesBox.getSelectedItem();
            
        }
        
        if(drinkSizesBox == source){
            drinkSize = (String)drinkSizesBox.getSelectedItem();
            
        }
        if((addButton == source)||(doneButton == source)){
            if(pizzaFlavour == null || pizzaFlavour.equalsIgnoreCase("none")){
                
            }
            else if(pizzaFlavour.equalsIgnoreCase("Chicken and Mashroom")){
                ChickenAndMashroom pizza = new ChickenAndMashroom(pizzaFlavour,pizzaSize,pizzaQuantity);
                ip.populateThePizzasIntoList(pizza, pizzas);
                ip.populateThePizzasIntoList(pizza,pizzasSummary);
            }else if(pizzaFlavour.equalsIgnoreCase("Beef and Cheese")){
                BeefAndCheese pizza = new BeefAndCheese(pizzaFlavour,pizzaSize,pizzaQuantity);
                ip.populateThePizzasIntoList(pizza, pizzas);
                ip.populateThePizzasIntoList(pizza,pizzasSummary);
            }else{
                ChickenAndMayo pizza = new ChickenAndMayo(pizzaFlavour,pizzaSize,pizzaQuantity);
                ip.populateThePizzasIntoList(pizza, pizzas);
                ip.populateThePizzasIntoList(pizza,pizzasSummary);
            }
            
            // Determine the drinks 
            if(drinkFlavour == null) {
                
            } else if(drinkFlavour.equalsIgnoreCase("Cold-drink")){
                ColdDrink drink = new ColdDrink(drinkFlavour,drinkSize,drinkQuantity);
                ip.populateTheDrinksIntoList(drink, drinks);
                ip.populateTheDrinksIntoList(drink,drinksSummary);
                
            }else if(drinkFlavour.equalsIgnoreCase("Juice")){
                Juice drink = new Juice(drinkFlavour,drinkSize,drinkQuantity);
                ip.populateTheDrinksIntoList(drink, drinks);
                ip.populateTheDrinksIntoList(drink,drinksSummary);
            }else {
            }
            
            
            String pizzaDetails = ip.getPizzasFromList(pizzas);
            String drinksDetails = ip.getDrinksFromList(drinks);
            
            
            // Add the message to the cart 
            ItemTrackPanel.text.setText(pizzaDetails+"\n"+drinksDetails);
            
            // Determine the total amounts due
             totalPizzasAmount = ip.getTotalPizzasAmount(pizzas);
             totalDrinksAmount = ip.getTotalDrinksAmount(drinks);
             totalAmountDue = ip.getTotalAmountDue(totalPizzasAmount,totalDrinksAmount);
            
             
             
            
            // add the total amount due to the payment section 
            message = String.format("Your total amount due is R %.2f.%nPlease make a payment below",totalAmountDue);
            PaymentSection.paymentText.setText(message);
            
            // restore to defaults 
            drinksBox.setSelectedIndex(0);
            
            drinkSizesBox.setSelectedIndex(0);
            sizesBox.setSelectedIndex(0);
            
            pizzaBox.setSelectedIndex(0);
            
            extraBox1.isEnabled();
            extraBox2.isEnabled();
        }
        
        if(nextButton == source){
            PaymentSection.paymentText.setText("");
            PaymentSection.changeText.setText("");
            PaymentSection.payment.setText("");
            ItemTrackPanel.text.setText("");
            
            // clear the lists
            pizzas.clear();
            drinks.clear();
            
        }
        
        if(source == extraBox1){
            totalAmountDue += cheeseExtrasAmount;
            ItemTrackPanel.text.append(String.format("Cheese Extras : %.2f%n",cheeseExtrasAmount));
                
            }
        
        if(source == extraBox2){
            totalAmountDue += baconExtrasAmount;
            ItemTrackPanel.text.append(String.format("Bacon Extras : %.2f%n",baconExtrasAmount));
         }

        if(PaymentSection.paymentButton == source){
            String value = PaymentSection.payment.getText();
            // convert the text in payment text to double
           
            double paymentValue = Double.parseDouble(value);
            
            double change = paymentValue - totalAmountDue;
            PaymentSection.changeText.setText(String.format("Your change is R %.2f.%nThank you for shopping with us",change));
 
        }
        
       
        
        

    }
}
