/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.socket.tcp;

import java.io.IOException;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class ClientLoader {
 
    public static void main(String[] args) throws IOException {
        
//        Server server = new Server();
//        server.turnOn();
        
        Client client = new Client();
        
        client.sendMessage("Hello my friend.");
    }
    
}
