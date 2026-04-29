/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Vaccination;

/**
 *
 * @author nsumba
 */
public interface VaccinationService extends Remote{
    public String vaccineRegister(Vaccination vac) throws RemoteException;
    public String vaccineUpdate(Vaccination vac) throws RemoteException;
    public String vaccineDelete(Vaccination vac) throws RemoteException;
    public List<Vaccination> getAllVaccinedRecords() throws RemoteException;
    public Vaccination getVaccinedCitizenById(Vaccination vac) throws RemoteException;
    
}
