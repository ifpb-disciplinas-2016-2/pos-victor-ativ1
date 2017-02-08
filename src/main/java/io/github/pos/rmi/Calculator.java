/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public interface Calculator extends Remote{
    
    double sum(double parcelOne, double parcelTwo) throws RemoteException;
    
    double subtraction(double parcelOne, double parcelTwo) throws RemoteException;
    
    double multiplication(double parcelOne, double parcelTwo) throws RemoteException;
    
    double division(double parcelOne, double parcelTwo) throws RemoteException;
    
}
