/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.rmi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class CalculatorNamingServer {

    public void start() throws IOException {
        
        try {

            Calculator calculator = new CalculatorImpl();

            LocateRegistry.createRegistry(4889);
            
            Naming.rebind("//localhost:4889/CalculatorService", calculator);
            
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(CalculatorNamingServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws IOException {

        CalculatorNamingServer calculatorServer = new CalculatorNamingServer();
        
        calculatorServer.start();
        
    }

}
