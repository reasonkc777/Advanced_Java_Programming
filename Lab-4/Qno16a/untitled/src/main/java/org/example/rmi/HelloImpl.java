package org.example.rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    protected HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the RMI server!";
    }
}
