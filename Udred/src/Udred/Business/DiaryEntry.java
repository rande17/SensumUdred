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
public class DiaryEntry
{
    private String topic;
    private String content;
    private Date diaryTimeStamp;
    private DiaryEntryTypeEnum type;

    protected DiaryEntry(String topic, String content, Date diaryTimeStamp, DiaryEntryTypeEnum type)
    {
        this.topic = topic;
        this.content = content;
        this.diaryTimeStamp = diaryTimeStamp;
        this.type = type;
    }
    
    
    
}
