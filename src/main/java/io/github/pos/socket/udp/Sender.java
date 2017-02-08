/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class Sender {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();
        
        byte[] data = "Oi tdo bom?".getBytes();

        DatagramPacket msgToSend = new DatagramPacket(data, data.length, InetAddress.getByName("10.3.191.255"), 4888);  
        
        System.out.println(new String(msgToSend.getData()));
        
        ds.send(msgToSend);

    }

}
