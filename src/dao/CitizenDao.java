/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Citizen;
import org.hibernate.*;

/**
 *
 * @author nsumba
 */

public class CitizenDao {
    //CREATE operation
    public String registerCitizen(Citizen citizen){
        //Creating a sessione
        Session ss = HibernateUtil.getSessionFactory().openSession();
        // create a transaction
        Transaction tr = ss.beginTransaction();
        citizen.setIsVaccinated(false);
        ss.save(citizen);
        tr.commit();
        ss.close();
        return "Data Saved Successfully";
    }
    
    //UPDATE Operation
    public String updateCitizen(Citizen citizen){
        //Creating a sessione
        Session ss = HibernateUtil.getSessionFactory().openSession();
        // create a transaction
        Transaction tr = ss.beginTransaction();
        ss.update(citizen);
        tr.commit();
        ss.close();
        return "Data Updated Successfully";
    }
    
    //DELETE Operation
    public String deleteCitizen(Citizen citizen){
        //Creating a sessione
        Session ss = HibernateUtil.getSessionFactory().openSession();
        // create a transaction
        Transaction tr = ss.beginTransaction();
        ss.delete(citizen);
        tr.commit();
        ss.close();
        return "Citizen deleted Successfully";
    }
    
    //READ DATA FROM THE DATABASE
    public List<Citizen> allCitizen(){
        //Create session
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<Citizen> citizensList = ss.createQuery("select cit from Citizen cit").list();
        ss.close();
        return citizensList;
    }
    
    // SEARCH CITIZEN BY ID
     public Citizen getCitizenById(Citizen citizen){
         Session ss = HibernateUtil.getSessionFactory().openSession();
         Citizen cit = (Citizen)ss.get(Citizen.class, citizen.getCitizen_id());
         ss.close();
         return cit;
     }
}
