/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class CalculatorClient {
    
    static Calculator calculator = null;
    
    public static void main(String[] args) {
        
        try {
            Calculator calculator = (Calculator) Naming.lookup("//localhost:4889/CalculatorService");
            
            System.out.println(calculator.sum(55, 100));
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(CalculatorClient.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
