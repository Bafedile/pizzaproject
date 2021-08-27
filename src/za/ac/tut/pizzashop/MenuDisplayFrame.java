/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import za.ac.tut.pizzashop.items.drinks.Drinks;
import za.ac.tut.pizzashop.items.pizzas.Pizzas;
import za.ac.tut.pizzashop.receiptfilehandling.ReceiptFileHandling;


public class MenuDisplayFrame extends JFrame implements ActionListener {
    DisplayPanel dp = new DisplayPanel();
    SelectionPanel sp = new SelectionPanel();
    ItemTrackPanel tp = new ItemTrackPanel();
    
    List<Pizzas> pizzas = SelectionPanel.pizzasSummary;
    List<Drinks> drinks = SelectionPanel.drinksSummary;
    
    public MenuDisplayFrame(){
        this.setLayout(null);
        this.setTitle("@Superio Code Pizza");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(860,685);
        
        // Add the selection panel 
        this.add(sp);
        this.add(dp);
        this.add(tp);
        this.setVisible(true);
        
        SelectionPanel.exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(SelectionPanel.exitButton == source){
            
            // store  the daily summary details to the file 
            ReceiptFileHandling file = new ReceiptFileHandling("./DailySummary.txt");
            String message;
            try{
                // get the pizzas daily summary details
                message = getPizzasDetails();
                System.out.println(message);
                file.writeToFile(message,false);
                
                
                //get the drinks daily summary details
                message = getDrinksDetails();
                file.writeToFile(message,true);
                
            }catch(IOException exception){
                JOptionPane.showMessageDialog(null,exception.getMessage(),"IOException error",JOptionPane.ERROR_MESSAGE);
            }
            
            new SummaryFrame();
            this.dispose();
        }
    }
    
    public String getDrinksDetails(){
        int juiceDrinkQuantity = 0,coldDrinkQuantity=0;
        double juiceDrinkTotalAmount = 0,coldDrinkTotalAmount = 0;
        
        for(Drinks drink: drinks){
            if(drink.getUnitFlavour().equalsIgnoreCase("juice")){
                juiceDrinkQuantity += drink.getUnitQuantity();
                juiceDrinkTotalAmount += drink.determineTotalAmount();
            }else{
                coldDrinkQuantity += drink.getUnitQuantity();
                coldDrinkTotalAmount += drink.determineTotalAmount();
            }
        }
        
        return String.format("Drinks Daily Summary%n"
                + "ColdDrink%n"
                + "Quantity: %d%n"
                + "TotalAmount : R%.2f%n"
                + "---------------------------------%n"
                + "Juice Drink%n"
                + "Quantity: %d%n"
                + "TotalAmount: R%.2f%n"
                + "---------------------------------%n"
                + "Total Drinks Amount Made: R%.2f%n",coldDrinkQuantity,coldDrinkTotalAmount,
                juiceDrinkQuantity,juiceDrinkTotalAmount,(juiceDrinkTotalAmount+ coldDrinkTotalAmount));
    }
    
    public String getPizzasDetails(){
        int chickenAndMashQuantity = 0,chickenAndMayoQuantity = 0,beefQuantity = 0;
        double chickenAndMashAmount = 0, chickenAndMayoAmount = 0,beefAmount= 0;
        
        for(Pizzas pizza: pizzas){
            if(pizza.getUnitFlavour().equalsIgnoreCase("chicken and mashroom")){
                chickenAndMashQuantity += pizza.getUnitQuantity();
                chickenAndMashAmount += pizza.determineTotalAmount();
                
            }else if(pizza.getUnitFlavour().equalsIgnoreCase("chicken and mayo")){
                chickenAndMayoQuantity += pizza.getUnitQuantity();
                chickenAndMayoAmount += pizza.determineTotalAmount();
            }else{
                beefAmount += pizza.determineTotalAmount();
                beefQuantity += pizza.getUnitQuantity();
            }
                    
        }
        return String.format("Pizza daily summary%n"
                + "Chicken And Mashroom%n"
                + "Quantity: %d%n"
                + "TotalAmount: R%.2f%n"
                + "------------------------------%n"
                + "Chicken And Mayo%n"
                + "Quantity: %d%n"
                + "TotalAmount: R%.2f%n"
                + "-------------------------------%n"
                + "Beef And Cheese%n"
                + "Quantity: %d%n"
                + "TotalAmount: R%.2f%n"
                + "------------------------------%n"
                + "Total Pizzas Daily Amount: R%.2f%n%n",chickenAndMashQuantity,
                chickenAndMashAmount,chickenAndMayoQuantity,
                chickenAndMayoAmount,beefQuantity,beefAmount,
                (beefAmount+chickenAndMayoAmount+chickenAndMashAmount));
        
    }
}
