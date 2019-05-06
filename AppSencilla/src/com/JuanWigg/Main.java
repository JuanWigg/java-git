
package com.JuanWigg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Main {
    
    public static void main(String [] args){
        //Init
        
        ArrayList<Usuario> users = new ArrayList<>();
        
        
        try
        {
            FileInputStream fis = new FileInputStream("/home/jgwiggenhauser/NetBeansProjects/files/users.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            users = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
           
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
           
        }
        
        
        
        VentanaLog v1 = new VentanaLog(users);
        
    }
    
    
    
    public static void guardarUsuarios(ArrayList<Usuario> users){
        
        try
        {
            FileOutputStream fos = new FileOutputStream("/home/jgwiggenhauser/NetBeansProjects/files/users.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        
    }
    
    
}
