/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Citizen;
import model.Vaccination;
import org.hibernate.*;

/**
 *
 * @author nsumba
 */
public class VaccinationDao {
    //CREATE Operation
    public String registerVaccination(Vaccination vaccination){
        //create session
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(vaccination);
        tr.commit();
        ss.close();
        return "Vaccination registered";
    }
    
    //UPDATE Operation
    public String updateVaccination(Vaccination vaccination){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(vaccination);
        tr.commit();
        ss.close();
        return "Data updated successful";
    }
    
    //DELETE Operation
    public String deleteVaccination(Vaccination vaccination){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(vaccination);
        tr.commit();
        ss.close();
        return "Data deleted Successful";
                
    }
    
    // READ ALL OPERATION
    public List<Vaccination> getAllVaccination(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<Vaccination> vaccinationsList = ss.createQuery("select vac from Vaccination vac").list();
        ss.close();
        return vaccinationsList;
    } 
    
    
}
