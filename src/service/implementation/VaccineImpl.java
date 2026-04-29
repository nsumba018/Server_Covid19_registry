/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.VaccinationDao;
import java.rmi.RemoteException;
import java.util.List;
import model.Vaccination;
import service.VaccinationService;

/**
 *
 * @author nsumba
 */
public class VaccineImpl implements VaccinationService{
    public VaccinationDao dao = new VaccinationDao();
    

    @Override
    public String vaccineRegister(Vaccination vac) throws RemoteException {
        return dao.registerVaccination(vac); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vaccineUpdate(Vaccination vac) throws RemoteException {
        return dao.updateVaccination(vac); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vaccineDelete(Vaccination vac) throws RemoteException {
        return dao.deleteVaccination(vac); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vaccination> getVaccinatedRecord() throws RemoteException {
        return dao.getAllVaccination(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vaccination getVaccinedCitizenById(Vaccination vac) throws RemoteException {
        return dao.getVaccinatedById(vac); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
