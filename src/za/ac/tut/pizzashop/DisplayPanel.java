/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author benov
 */
public class DisplayPanel extends JPanel {
    JLabel label = new JLabel("Items Menu");
    JTextArea text = new JTextArea("Buy Any Two \n\n"
            + "Or More Large Pizzas\n\n"
            + "And Get 12% OFF\n\n"
            + "Your Purchase\n\n"
            + "@Superio Code Pizza \n\n\n"
            + "We Care For Our Customers!!");
    
//    BufferedImage beefAndCheese ;
    JLabel beef = new JLabel(new ImageIcon("beef_and_cheese.jpg"));
    JLabel mashroom = new JLabel(new ImageIcon("mushroompizza.jpg"));
    JLabel mayo = new JLabel(new ImageIcon("chicken_and_mayo.jpg"));
    
    JLabel mashroomLabel = new JLabel("Chicken And Mushroom");
    JLabel beefLabel = new JLabel("Beef And Cheese");
    JLabel mayoLabel = new JLabel("Chicken And Mayo");
    Border border = BorderFactory.createLineBorder(Color.magenta, 25);
    public DisplayPanel(){
        this.setLayout(null);
        this.setBackground(Color.lightGray);
        this.setBorder(border);
        this.setBounds(0,0,850,250);
        this.label.setBounds(325,0,90,30);
        this.label.setForeground(Color.WHITE);
        this.label.setBorder(new LineBorder(Color.magenta));
        
        
        this.beef.setBounds(10,40,200,180);
        this.beefLabel.setBounds(20,220,200,20);
        this.beefLabel.setForeground(Color.WHITE);
        
        this.mashroom.setBounds(240,40,200,180);
        this.mashroomLabel.setBounds(260,220,200,20);
        this.mashroomLabel.setForeground(Color.WHITE);
        
        this.mayo.setBounds(470,40,200,180);
        this.mayoLabel.setBounds(510,220,200,20);
        this.mayoLabel.setForeground(Color.WHITE);
        
        this.text.setBounds(670,20,200,200);
        this.text.setBackground(Color.lightGray);
        this.text.setBorder(new LineBorder(Color.CYAN));
        this.text.setFont(new Font("Verdana",Font.ITALIC,17));
        this.text.setForeground(Color.BLUE);
        this.text.setEditable(false);
        
        // add the features
        this.add(label);
        this.add(text);
        this.add(beef);
        this.add(mashroom);
        this.add(mayo);
        this.add(beefLabel);
        this.add(mayoLabel);
        this.add(mashroomLabel);
        this.setVisible(true);
    }

}
