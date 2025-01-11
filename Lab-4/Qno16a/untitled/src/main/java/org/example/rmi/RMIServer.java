package org.example.rmi;

import org.example.rmi.HelloImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Start the RMI registry
            LocateRegistry.createRegistry(1099);

            // Create the remote object
            HelloImpl obj = new HelloImpl();
            // Bind the object in the RMI registry
            Naming.rebind("Hello", obj);

            System.out.println("RMI Server is ready.");
        } catch (Exception e) {
            System.out.println("RMI Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
