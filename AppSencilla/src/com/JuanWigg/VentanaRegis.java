
package com.JuanWigg;

import java.awt.Color;
import javax.swing.*;


public class VentanaRegis extends JFrame {
    JButton botonCancel;
    JButton botonRegis;
    JButton label_user;
    JButton label_pass;
    JButton label_email;
    JButton label_fechaNac;
    JPanel panel;
    
    
    
    public VentanaRegis(){
        setVisible(true);
        setSize(600,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("WiggenSoft");
        
        panel = new JPanel();
        panel.setLayout(null);
        
        getContentPane().add(panel);
        configLabels();
        
        configTextFields();
        configBotones();
        
        panel.setBackground(Color.blue);
    }
    
    
    private void configLabels(){
        //XD
        
    }
    
    private void configTextFields(){
        
        
    }
    
    private void configBotones(){
        
        
    }
    
}
