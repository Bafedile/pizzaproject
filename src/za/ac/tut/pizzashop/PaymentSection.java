/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class PaymentSection extends JPanel implements ActionListener{
   
    JLabel label  = new JLabel("Payment Section");
//    static String  message = "Your total amount due is R"+223+"\nPlease make a payment below";
     static JTextArea paymentText = new JTextArea();
     static JTextArea changeText  = new JTextArea();
     static JTextField payment = new JTextField();
    public static JButton paymentButton  = new JButton("Pay");
     PaymentSection(){
        this.setLayout(null);
        this.setBorder(new LineBorder(Color.BLACK));
        this.setBounds(210,190,290,400);
        this.setBackground(Color.PINK);
        
        // set label bounds
        this.label.setBounds(80,0,150,30);
        this.label.setForeground(Color.blue);
        this.label.setBorder(new LineBorder(Color.cyan));
        
        //set the payment text field
        this.paymentText.setBounds(5,60,280,60);
        this.payment.setBounds(5,130,100,30);
        this.paymentButton.setBounds(100,130,90,30);
        
        // set change text
        this.changeText.setBounds(5,170,280,100);
        
        
        // add features
        this.add(label);
        this.add(paymentText);
        this.add(payment);
        this.add(paymentButton);
        this.add(changeText);
        
        this.setOpaque(true);
        this.setVisible(true);
        
        
        // Add action listener to the buttons
        paymentButton.addActionListener(this);
        
        
       
    }

    // declare classes 
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        SelectionPanel selectionPanel = new SelectionPanel();
//        if(source == paymentButton){
//            String value = payment.getText();
//            // convert the text in payment text to double
//            double totalAmountDue = selectionPanel.totalAmountDue;
//            double paymentValue = Double.parseDouble(value);
//            
//            double change = paymentValue - totalAmountDue;
//            paymentText.setText(String.format("Your change is R %.2f.%nThank you for shopping with us",change));
// 
//        }
    }
}
