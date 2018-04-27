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
public class Case {

    private final int caseID;
    private int status; // enum
    private final Patient patient;
    private User caseWorker;
    private final Date creationDate;
    private Date closingDate;
    private boolean consent;
    private final CaseInformation caseInformation;
    private CaseTypeEnum caseType;

    protected Case(int caseID, Patient patient, int status, boolean consent, String caseType, User caseWorker) {
        setCaseType(caseType);
        this.caseID = caseID;
        this.patient = patient;
        this.status = status;
        this.consent = consent;
        this.caseWorker = caseWorker;
        this.creationDate = new Date();
        this.closingDate = null;
        this.caseInformation = new CaseInformation();
    }

    protected int getStatus() {
        return status;
    }

    protected void setStatus(int status) {
        this.status = status;
    }

    protected Date getClosingDate() {
        return closingDate;
    }

    protected void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    protected boolean isConsent() {
        return consent;
    }

    protected void setConsent(boolean consent) {
        this.consent = consent;
    }

    protected CaseTypeEnum getCaseType() {
        return caseType;
    }

    protected void setCaseType(String caseType) {
        // if-statement for at sætte den rigtige casetype
        if (caseType.toLowerCase().equals("social")) {
            this.caseType = CaseTypeEnum.SOCIALISSUES;
        } else if (caseType.toLowerCase().equals("psychology")) {
            this.caseType = CaseTypeEnum.PSYCHOLOGICAL;
        } else if (caseType.toCharArray().equals("physical")) {
            this.caseType = CaseTypeEnum.PHYSICALDISABILITY;
        }
    }

    protected int getCaseID() {
        return caseID;
    }

    protected Patient getPatient() {
        return patient;
    }

    protected Date getCreationDate() {
        return creationDate;
    }

    protected CaseInformation getCaseInformation() {
        return caseInformation;
    }
    
    public void setCaseWorker(User caseWorker) {
        this.caseWorker = caseWorker;
    }
}