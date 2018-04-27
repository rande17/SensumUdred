/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.ArrayList;

/**
 *
 * @author Linea Hoffmann
 */
public class Patient
{


    private String patientName;
    private Address patientAddress;
    private int patientTelephone;
    private int patientCPR;
    private ArrayList<Guardian> patientGuardians;

    protected Patient(String patientName, int patientCPR, int patientTelephone)
    {
        this.patientName = patientName;
        this.patientCPR = patientCPR;
        this.patientTelephone = patientTelephone;
                
    }
    
    protected void addGuardian (String name, int CPR, int telephone)
    {
        
    }
    
    protected void removeGuardian(int CPR)
    {
        
    }
    
    protected String getPatientName()
    {
        return patientName;
    }

    protected void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }

    protected Address getPatientAddress()
    {
        return patientAddress;
    }

    protected void setPatientAddress(Address patientAddress)
    {
        this.patientAddress = patientAddress;
    }

    protected int getPatientTelephone()
    {
        return patientTelephone;
    }

    protected void setPatientTelephone(int patientTelephone)
    {
        this.patientTelephone = patientTelephone;
    }

    public int getPatientCPR()
    {
        return patientCPR;
    }

//    public ArrayList[] getPatientGuardians()
//    {
//        return ;
//    }
    
    
}
