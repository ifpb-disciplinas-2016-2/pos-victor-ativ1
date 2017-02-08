/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.rmi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class CalculatorRegistryServer {

    public void start() throws IOException {

        try {

            Calculator calculator = new CalculatorImpl();

            Registry registry = LocateRegistry.createRegistry(4889);

            registry.rebind("CalculatorService", calculator);

        } catch (RemoteException ex) {
            Logger.getLogger(CalculatorRegistryServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws IOException {

        CalculatorRegistryServer calculatorServer = new CalculatorRegistryServer();

        calculatorServer.start();

    }

}
