/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

/**
 *
 * @author benov
 */
public class ItemTrackPanel extends JPanel {
    static JTextArea text = new JTextArea();
    JScrollPane scrollableTextArea = new JScrollPane(text);
    JLabel label = new JLabel("Items Selected");
    
    public ItemTrackPanel(){
        this.setLayout(null);
        this.setBorder(new LineBorder(Color.BLACK));
        this.setBounds(500,250,350,400);
        
        // set label
        this.label.setBounds(90,0,200,30);
        // set the text area
//        this.text.setBounds(5,40,480,375);
        this.scrollableTextArea.setBounds(5,40,340,360);
        
        // add features
//        this.add(text);
        this.add(label);
        this.add(scrollableTextArea);
//        this.setBackground(Color.yellow);
        this.setVisible(true);
    }
    public void setText(String text){
        this.text.setText(text);
    }
}
