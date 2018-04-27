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
public class InquiryInformation
{
    private String inquiry;
    
    protected InquiryInformation(String inquiry)
    {
        
    }

    protected String getInquiry()
    {
        return inquiry;
    }

    protected void setInquiry(String inquiry)
    {
        this.inquiry = inquiry;
    }
    
    
    
}
