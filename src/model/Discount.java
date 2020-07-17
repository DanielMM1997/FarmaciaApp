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
public class Discount {
    private int percentage;
    private Date date;
    
    public Discount (int percentage, Date date) {
        this.percentage = percentage;
        this.date = date;
    }
    public float getDiscount () {
        float descuento = this.percentage/100;
        return descuento;
    }
}
