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
    static int customerOrder = 1;
    JScrollPane scrollableTextArea = new JScrollPane(text);
    JLabel label = new JLabel("Items Selected");
    static JLabel customerNo = new JLabel("Customer Order/No "+customerOrder);
    public ItemTrackPanel(){
        this.setLayout(null);
        this.setBackground(Color.cyan);
        this.setBorder(new LineBorder(Color.BLACK));
        this.setBounds(500,250,350,400);
        
        // set label
        this.label.setBounds(90,0,200,30);
        ItemTrackPanel.customerNo.setBounds(90,30,200,30);
        ItemTrackPanel.customerNo.setForeground(Color.BLUE);
        ItemTrackPanel.customerNo.setBorder(new LineBorder(Color.MAGENTA));
        // set the text area

        this.scrollableTextArea.setBounds(5,60,340,360);
        ItemTrackPanel.text.setEditable(false);
        ItemTrackPanel.text.setBackground(Color.GRAY);
        ItemTrackPanel.text.setForeground(Color.white);
        
        
        // add features
        this.add(label);
        this.add(customerNo);
        this.add(scrollableTextArea);
        this.setVisible(true);
    }

}
