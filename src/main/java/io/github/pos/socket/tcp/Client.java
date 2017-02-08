/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.socket.tcp;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class Client {
    
    private Socket socket;
    
    public void connect() throws IOException{
        socket  = new Socket("localhost", 10999);
    }
    
    public void desconnect() throws IOException{
        socket.close();
    }
    
    public void sendMessage(String message) throws IOException{
        connect();
        
        System.out.println("Sending message...");
        
        socket.getOutputStream().write(message.getBytes());
        socket.getOutputStream().flush();
        
        desconnect();
    }
    
}
