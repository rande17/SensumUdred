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
public class Guardian
{
    private String guardianName;
    private int guardianCPR;
    private Address guardianaddress;
    private int guardianTelephone;
    
    protected Guardian(String guardianName, int guardianCPR, int guardianTelephone)
    {
        this.guardianName = guardianName;
        this.guardianCPR = guardianCPR;
        this.guardianTelephone = guardianTelephone;
    }

    protected String getGuardianName()
    {
        return guardianName;
    }

    protected int getGuardianCPR()
    {
        return guardianCPR;
    }

    protected Address getGuardianaddress()
    {
        return guardianaddress;
    }

    protected int getGuardianTelephone()
    {
        return guardianTelephone;
    }

    protected void setGuardianTelephone(int guardianTelephone)
    {
        this.guardianTelephone = guardianTelephone;
    }
    
}
