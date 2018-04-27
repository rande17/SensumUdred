/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 */
public class Case
{
    private int caseID;
    private int status; // enum
    private Patient patient;
    private User caseWorker;
    private Date creationDate;
    private Date closingDate;
    private boolean consent;
    private CaseInformation caseInformation;
    private CaseTypeEnum caseType;
    
    
    
    protected Case(int caseID, Patient patient, int status, boolean consent, CaseTypeEnum caseType)
    {
        
    }

    protected int getStatus()
    {
        return status;
    }

    protected void setStatus(int status)
    {
        this.status = status;
    }

    protected Date getClosingDate()
    {
        return closingDate;
    }

    protected void setClosingDate(Date closingDate)
    {
        this.closingDate = closingDate;
    }

    protected boolean isConsent()
    {
        return consent;
    }

    protected void setConsent(boolean consent)
    {
        this.consent = consent;
    }

    protected CaseTypeEnum getCaseType()
    {
        return caseType;
    }

    protected void setCaseType(CaseTypeEnum caseType)
    {
        this.caseType = caseType;
    }

    protected int getCaseID()
    {
        return caseID;
    }

    protected Patient getPatient()
    {
        return patient;
    }

    protected Date getCreationDate()
    {
        return creationDate;
    }

    protected CaseInformation getCaseInformation()
    {
        return caseInformation;
    } 
}
