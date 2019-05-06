
package com.JuanWigg;


import java.io.Serializable;


public class Usuario implements Serializable {
    
    String username;
    String password;
    String email;
    int dia;
    int mes;
    int anio;
    
    
    public Usuario(String username, String password, String email, int dia, int mes, int anio){
        this.username = username;
        this.password = password;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
        
    }
    
   
    
    
}
