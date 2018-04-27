/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

/**
 *
 * @author Linea Hoffmann
 */
public class Address
{
    private int zipCode; 
    private String city;
    private String streetName;
    private int houseNumber;
    
    protected Address(String streetName, int houseNumber, String city, int zipCode)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
        
    }

    protected int getZipCode()
    {
        return zipCode;
    }
    
    protected void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    protected String getCity()
    {
        return city;
    }
    
    protected void setCity(String city)
    {
        this.city = city;
    }

    protected String getStreetName()
    {
        return streetName;
    }
    
    protected void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    protected int getHouseNumber()
    {
        return houseNumber;
    }
    
    protected void setHouseNumber(int houseNumber)
    {
        this.houseNumber = houseNumber;
    } 
    
}
