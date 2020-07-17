/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Alarm {
    
    private Date date;
    private Time time;
    
    public Alarm (Date date, Time time) {
        this.date = date;
        this.time = time;
    }
}
