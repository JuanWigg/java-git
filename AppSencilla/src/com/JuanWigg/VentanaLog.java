
package com.JuanWigg;

import java.awt.Color;
import javax.swing.*;

public class VentanaLog extends JFrame{
    JPanel panel;
    
    
    public VentanaLog(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("WiggenSoft");
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        configPanel();
        
    }
    
    private void configPanel(){
        panel.setBackground(Color.blue);
        
    }
    
    
}
