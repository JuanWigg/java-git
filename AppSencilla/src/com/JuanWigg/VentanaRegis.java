
package com.JuanWigg;

import java.awt.Color;
import javax.swing.*;


public class VentanaRegis extends JFrame {
    JButton botonCancel;
    JButton botonRegis;
    JLabel label_user;
    JLabel label_pass;
    JLabel label_email;
    JLabel label_fechaNac;
    JPanel panel;
    datechooser.beans.DateChooserCombo fecha = new datechooser.beans.DateChooserCombo();
    JTextField text_user;
    JTextField text_email;
    JPasswordField text_pass;
    
    public VentanaRegis(){
        setVisible(true);
        setSize(600,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("WiggenSoft");
        setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        getContentPane().add(panel);
        configLabels();
        
        configTextFields();
        configBotones();
        
        panel.setBackground(Color.blue);
    }
    
    
    private void configLabels(){
        
        label_user = new JLabel("Nombre de usuario:");
        label_pass = new JLabel("Contraseña:");
        label_email = new JLabel("E-mail:");
        label_fechaNac = new JLabel("Fecha de nacimiento:");
        
        label_user.setBounds(200,100,200,30);
;       label_pass.setBounds(200,200,200,30);
        label_email.setBounds(200,300,200,30);
        label_fechaNac.setBounds(200,400,200,30);
        
        label_user.setForeground(Color.MAGENTA);
        label_pass.setForeground(Color.MAGENTA);
        label_email.setForeground(Color.MAGENTA);
        label_fechaNac.setForeground(Color.MAGENTA);
        
        
        panel.add(label_user);
        panel.add(label_pass);
        panel.add(label_email);
        panel.add(label_fechaNac);
        
        
    }
    
    private void configTextFields(){
        
        text_user = new JTextField();
        text_email = new JTextField();
        text_pass = new JPasswordField();
        
        text_user.setBounds(200,130,200,30);
        text_email.setBounds(200,330,200,30);
        text_pass.setBounds(200,230,200,30);
        
        panel.add(text_user);
        panel.add(text_pass);
        panel.add(text_email);
        
        fecha.setBounds(200,430,200,30);
        panel.add(fecha);
        
    }
    
    private void configBotones(){
        botonRegis = new JButton("Registrarse");
        botonCancel = new JButton("Cancelar");
        
        botonRegis.setBounds(300,550,200,100);
        botonCancel.setBounds(75,550,200,100);
        
        
        panel.add(botonRegis);
        panel.add(botonCancel);
    }
    
}
