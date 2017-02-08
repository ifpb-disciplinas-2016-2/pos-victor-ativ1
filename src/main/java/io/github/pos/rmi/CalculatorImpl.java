/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class CalculatorImpl extends UnicastRemoteObject implements Calculator{

    public CalculatorImpl() throws RemoteException  
    { 
        super(); 
    } 
    
    @Override
    public double sum(double parcelOne, double parcelTwo) throws RemoteException {
        
        return parcelOne+parcelTwo;
    }

    @Override
    public double subtraction(double parcelOne, double parcelTwo) throws RemoteException {
        
        return parcelOne-parcelTwo; 
    }

    @Override
    public double multiplication(double parcelOne, double parcelTwo) throws RemoteException {
        
        return parcelOne*parcelTwo;
    }

    @Override
    public double division(double parcelOne, double parcelTwo) throws RemoteException {
        
        return parcelOne/parcelTwo;
    }
    
}
