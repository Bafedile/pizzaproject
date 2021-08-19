/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import za.ac.tut.pizzashop.receiptfilehandling.ReceiptFileHandling;

/**
 *
 * @author benov
 */
public class SummaryFrame extends JFrame  implements ActionListener{
    
    JTextArea textArea = new JTextArea();
    JScrollPane scrollableTextArea =new JScrollPane(textArea);
    ReceiptFileHandling file = new ReceiptFileHandling("./DailySummary.txt");
    JButton exitButton = new JButton("Exit");
    JButton backButton = new JButton("Back");
    
    public SummaryFrame(){
        this.setLayout(null);
        this.setTitle("@Superio Code PizzaShop Summary");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        
        // set the features
        this.scrollableTextArea.setBounds(0,0,450,400);
        this.exitButton.setBounds(300,430,90,30);
        this.backButton.setBounds(0,430,90,30);

        this.add(scrollableTextArea);
        this.add(exitButton);
        this.add(backButton);
        // add the summary to the text field
        try{
            String message = file.readFromFile();
            this.textArea.setText(message);
        }catch(IOException e){
            
        }
        
        // add the action listener
        exitButton.addActionListener(this);
        backButton.addActionListener(this);
        // Add the selection panel 
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       
       if(source == exitButton){
           this.dispose();
       }
       
       if(source == backButton){
           new MenuDisplayFrame();
       }
    }
}
