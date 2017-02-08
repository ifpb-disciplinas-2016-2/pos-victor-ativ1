/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private InputStream in;

    public Server() throws IOException {

        serverSocket = new ServerSocket();
    }

    public void turnOn() throws IOException {

        new Thread() {

            @Override
            public void run() {
                try {
                    serverSocket.bind(new InetSocketAddress(10999));

                    clientSocket = serverSocket.accept();

                    System.out.println("Client connected");

                    in = clientSocket.getInputStream();
                    byte[] bytes = new byte[1024];
                    in.read(bytes);

                    System.out.println("Client menssage: ");
                    System.out.println(new String(bytes).trim());

                    turnOff();
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.start();

    }

    public void turnOff() throws IOException {

        in.close();
        clientSocket.close();
    }

    public void restart() throws IOException {

        try {
            turnOff();
        } catch (IOException ex) {
        }

        turnOn();
    }

}
