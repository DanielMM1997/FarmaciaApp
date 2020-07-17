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
public class Delivery {
    
    private Date date;
    private Time time;
    private String address;
    
    public Delivery (Date date, Time time, String address) {
        this.date = date;
        this.time = time;
        this.address = address;
    }
}
