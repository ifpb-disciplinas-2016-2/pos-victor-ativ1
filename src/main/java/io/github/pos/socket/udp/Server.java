/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.net.SocketException;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class Server {

    public static void main(String[] args) throws SocketException, IOException {

        MulticastSocket ms = new MulticastSocket(4888);

        byte[] buffer = new byte[1024];

        DatagramPacket receivedData = new DatagramPacket(buffer, buffer.length);

        ms.receive(receivedData);

        System.out.println(new String(receivedData.getData()));

    }

}
