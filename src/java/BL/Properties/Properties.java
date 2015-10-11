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
public class Properties {
    //Address
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    //Price
    private String Price;

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    //Discription
    private String Discription;

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
    
    //Status
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    //PropType
    private String PropType;

    public String getPropType() {
        return PropType;
    }

    public void setPropType(String PropType) {
        this.PropType = PropType;
    }
    
    public void Properties(String Address,String Price,String Discription,String Status,String PropType)
    {
        this.Address = Address;
        this.Price = Price;
        this.Discription = Discription;
        this.Status = Status;
        this.PropType = PropType;
    }
    
}