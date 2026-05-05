/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.implementation.CitizenImpl;

/**
 *
 * @author nsumba
 */
public class Server {
    
    private CitizenImpl citizenImpl;
    
    
    public Server() throws RemoteException{
        this.citizenImpl = new CitizenImpl();
    }
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(7000);
            registry.rebind("citizen", new Server().citizenImpl);
            System.out.println("Server is running on port 7000");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
