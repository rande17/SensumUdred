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
public class User {

    private String userName = "Just some init value, not sure wether or not to include it in the constructor";
    private final int workerID;
    private ArrayList<Integer> caseList;
    private int accessLevel;

    /**
     *
     * @param workerID constructs a user with the ID provided in the parameter
     * list
     */
    protected User(int workerID) {
        this.workerID = workerID;
    }

    /**
     *
     * Jeg er ret usikker pp hvad intentionen er her, at caseList er en
     * ArrayList af ints giver ikke meget mening, med det der ellers er her
     *
     * @param caseID takes a caseID that should match a caseID
     * @return the caseID if it's contained in the caseList otherwise returns -1
     */
    protected int getCase(int caseID) {
        if (caseList.get(caseID) != -1) {
            return caseList.get(caseID);
        } else {
            return -1;
        }
    }

    /**
     *
     * @param currentCase add a caseID to the caseList
     */
    protected void addCase(Case currentCase) {
        this.caseList.add(currentCase.getCaseID());
    }

    /**
     *
     * @param currentCase removed a caseID from the caseList
     */
    protected void removeCase(Case currentCase) {
        this.caseList.remove(currentCase.getCaseID());
    }

    /**
     *
     * @return gets the current userName of this user
     */
    protected String getUserName() {
        return userName;
    }

    /**
     *
     * @return gets the workerID of this user
     */
    protected int getWorkerID() {

        return workerID;
    }

}
