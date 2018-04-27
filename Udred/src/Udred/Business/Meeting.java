/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 */
public class Meeting
{
    private Date meetingTime;
    private Patient patient;
    private Address meetingAddress;
    private PartRepresentive partRepresentive;
    private ArrayList[] assessorList;

    protected Meeting(Date meetingTime, Patient patient, Address meetingAddress, PartRepresentive partRepresentive, ArrayList[] assessorList)
    {
        this.meetingTime = meetingTime;
        this.patient = patient;
        this.meetingAddress = meetingAddress;
        this.partRepresentive = partRepresentive;
        this.assessorList = assessorList;
    }
    
    protected void addAssessor(String name, int assessorTelephone, String function)
    {
        
    }
    
    
    
    
}
