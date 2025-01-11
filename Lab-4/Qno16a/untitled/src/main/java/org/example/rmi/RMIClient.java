package org.example.rmi;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Lookup the remote object in the RMI registry
            Hello hello = (Hello) Naming.lookup("rmi://localhost/Hello");

            // Call the remote method
            String response = hello.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.out.println("RMI Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
