/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.awt.List;


/**
 *
 * @author Linea Hoffmann
 */
public class DatabaseFacade
{
    private String dataHost;
    private String databaseName;
    private String userName;
    private String password; 

    protected DatabaseFacade(String dataHost, String databaseName, String userName, String password)
    {
        this.dataHost = dataHost;
        this.databaseName = databaseName;
        this.userName = userName;
        this.password = password;
    }
    
    protected void specific()
    {
        
    }
//
//    protected List findCasesCPR(String CPRNumber)
//    {
//        return;
//    }
//
//    protected List findCasesName(String Name)
//    {
//        return ;
//
//    }

    protected boolean removeInformationConsent()
    {
        return true;
    }

    protected boolean addInformationConsent()
    {
        return true;
    }

    protected boolean removeCaseConsent()
    {
        return true;
    }

    protected boolean addCaseConsent()
    {
        return true;
    }
    
}
