/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Tenant {
    //Name
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    //LandLord
    private LandLord LandLord;

    public LandLord getLandLord() {
        return LandLord;
    }

    public void setLandLord(LandLord LandLord) {
        this.LandLord = LandLord;
    }
    
    //StartDate
    private Date StartDate;

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
    
    //EndDate
    private Date EndDate;

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    
}
