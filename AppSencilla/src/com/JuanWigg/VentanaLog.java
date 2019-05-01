
package com.JuanWigg;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class VentanaLog extends JFrame{
    JPanel panel;
    JButton botonLogin;
    JButton botonRegis;
    JLabel label_user;
    JLabel label_pass;
    JTextField text_user;
    JPasswordField text_pass;
    JLabel titulo;
    
    
    
    public VentanaLog(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("WiggenSoft");
        
        panel = new JPanel();
        
        panel.setBackground(Color.blue);
        panel.setLayout(null);
        getContentPane().add(panel);
        configLabels();
        
        configTextFields();
        configBotones();
        
        
        
    }
    
    private void configLabels(){
       label_user = new JLabel("Nombre de usuario:");
       label_user.setBounds(200,200,200,30);
       label_user.setForeground(Color.MAGENTA);
       //label_user.setBackground(Color.CYAN);
       //label_user.setOpaque(true);
       
       label_pass = new JLabel("Contraseña:");
       label_pass.setBounds(200,300,200,30);
       label_pass.setForeground(Color.MAGENTA);
       //label_pass.setBackground(Color.CYAN);
       //label_pass.setOpaque(true);
        
       
       titulo = new JLabel("WiggenSoft");
       titulo.setBounds(200,10,400,200);
       titulo.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,36));
       
       panel.add(label_user);
       panel.add(label_pass);
       panel.add(titulo);
    }
    
    private void configTextFields(){
        text_user = new JTextField();
        text_pass = new JPasswordField();
        
        text_user.setBounds(200,240,200,30);
        text_pass.setBounds(200,340,200,30);
        
        panel.add(text_user);
        panel.add(text_pass);
        
        
    }
    
    private void configBotones(){
        
        botonLogin = new JButton("Iniciar sesión");
        botonRegis = new JButton("Registrarse");
        
        botonLogin.setBounds(200,450,200,100);
        botonRegis.setBounds(200,600,200,100);
        
        panel.add(botonLogin);
        panel.add(botonRegis);
        
    }
    
    
}