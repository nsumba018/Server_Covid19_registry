/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.CitizenDao;
import java.rmi.RemoteException;
import java.util.List;
import model.Citizen;
import service.CitizenService;

/**
 *
 * @author nsumba
 */
public class CitizenImpl implements CitizenService{
    CitizenDao dao = new CitizenDao();

    @Override
    public String registerCitizen(Citizen citizen) throws RemoteException {
        return dao.registerCitizen(citizen); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String updateCitizen(Citizen citizen) throws RemoteException {
        return dao.updateCitizen(citizen); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String deleteCitizen(Citizen citizen) throws RemoteException {
        return dao.deleteCitizen(citizen); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citizen> getAllCitizen() throws RemoteException {
        return dao.allCitizen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Citizen getCitizenById(Citizen citizen) throws RemoteException {
        return dao.getCitizenById(citizen); //To change body of generated methods, choose Tools | Templates.
    }
    
}
