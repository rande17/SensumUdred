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
public class Assessor
{
    private String assessorName;
    private int assessorTelephone;
    private String function;

    protected Assessor(String assessorName, int assessorTelephone, String function)
    {
        this.assessorName = assessorName;
        this.assessorTelephone = assessorTelephone;
        this.function = function;
    }
    
    
    
}
