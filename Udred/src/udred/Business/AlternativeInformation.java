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
public class AlternativeInformation
{
    private String title; 
    private String subject;
    private String Content;
    private Date alternativeInformationTime;

    protected AlternativeInformation(String title, String subject, String Content)
    {
        this.title = title;
        this.subject = subject;
        this.Content = Content;
    }
    
    protected void getInformation()
    {
        
    }
    
    
    
}
