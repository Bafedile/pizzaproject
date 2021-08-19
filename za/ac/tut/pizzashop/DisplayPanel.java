/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author benov
 */
public class DisplayPanel extends JPanel {
    JLabel label = new JLabel("Items Menu");
//    BufferedImage beefAndCheese ;
    JLabel beef = new JLabel(new ImageIcon("beef_and_cheese.jpg"));
    JLabel mashroom = new JLabel(new ImageIcon("mushroompizza.jpg"));
    JLabel mayo = new JLabel(new ImageIcon("chicken_and_mayo.jpg"));
    
    JLabel mashroomLabel = new JLabel("Chicken And Mushroom");
    JLabel beefLabel = new JLabel("Beef And Cheese");
    JLabel mayoLabel = new JLabel("Chicken And Mayo");
    
    public DisplayPanel(){
        this.setLayout(null);
        this.setBorder(new LineBorder(Color.BLACK));
        this.setBounds(0,0,850,250);
        this.label.setBounds(325,0,200,30);
        
        
        
        this.beef.setBounds(10,40,200,180);
        this.beefLabel.setBounds(20,220,200,20);
        
        this.mashroom.setBounds(250,40,200,180);
        this.mashroomLabel.setBounds(260,220,200,20);
        
        this.mayo.setBounds(500,40,200,180);
        this.mayoLabel.setBounds(510,220,200,20);
        
        // add the features
        this.add(label);
        this.add(beef);
        this.add(mashroom);
        this.add(mayo);
        this.add(beefLabel);
        this.add(mayoLabel);
        this.add(mashroomLabel);
//        this.setBackground(Color.GRAY);
        this.setVisible(true);
    }
    
//    @Override
//    protected void paintComponent(Graphics g){
//        super.paintComponent(g);
//        g.drawImage(beefAndCheese,30,30,this);
//    }
}
