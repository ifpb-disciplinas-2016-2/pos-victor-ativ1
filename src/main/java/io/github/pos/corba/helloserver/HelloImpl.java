/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.pos.corba.helloserver;

/**
 *
 * @author natarajan
 */

import io.github.pos.corba.hello.HelloPOA;
import org.omg.CORBA.*;

class HelloImpl extends HelloPOA {
     private ORB orb;
      public void setORB(ORB orb_val) {
            orb = orb_val;
}
     // Implement sayHello() method
     @Override
      public String sayHello() {
           return "\nHello world !!\n";
}
     // Implement shutdown() method
     @Override
     public void shutdown() {
           orb.shutdown(false);
} }