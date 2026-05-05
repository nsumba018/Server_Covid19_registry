/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author nsumba
 */
@Entity
public class Citizen implements Serializable{
    @Id
    private String citizen_id;
    @Column(name = "full_names")
    private String fullnames;
    private String phone_Number;
    private boolean is_vaccinated;

    public Citizen() {
    }

    public Citizen(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public Citizen(String citizen_id, String fullnames, String phone_Number) {
        this.citizen_id = citizen_id;
        this.fullnames = fullnames;
        this.phone_Number = phone_Number;
    }

    public boolean isIs_vaccinated() {
        return is_vaccinated;
    }

    public void setIs_vaccinated(boolean is_vaccinated) {
        this.is_vaccinated = is_vaccinated;
    }

    
    
    public String getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }
    
    
    
}
