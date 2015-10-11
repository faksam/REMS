/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.Properties;

/**
 *
 * @author Samuel
 */
public class Residential extends Properties {
    
    //No_Rooms
    private int No_Rooms;

    public int getNo_Rooms() {
        return No_Rooms;
    }

    public void setNo_Rooms(int No_Rooms) {
        this.No_Rooms = No_Rooms;
    }
    
    //No_Bath
    private int No_Bath;

    public int getNo_Bath() {
        return No_Bath;
    }

    public void setNo_Bath(int No_Bath) {
        this.No_Bath = No_Bath;
    }
    
    //Living Area
    private String LivingArea;

    public String getLivingArea() {
        return LivingArea;
    }

    public void setLivingArea(String LivingArea) {
        this.LivingArea = LivingArea;
    }
    
    //ResType
    private String ResType;

    public String getResType() {
        return ResType;
    }

    public void setResType(String ResType) {
        this.ResType = ResType;
    }
}