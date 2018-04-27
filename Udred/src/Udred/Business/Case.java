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

    /**
     * Needs proper debugging, havent been able to test this correctly
     * @param caseType takes a type of case that should be in enum CaseTypeEnum
     */
    protected void setCaseType(String caseType) {
        for (CaseTypeEnum caseT : CaseTypeEnum.values()) {
            if (caseType.toLowerCase().equals(caseT.toString())) {
                this.caseType = CaseTypeEnum.valueOf(caseType.toLowerCase());
                break; 
            }
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
