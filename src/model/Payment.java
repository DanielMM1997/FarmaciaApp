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
public class Payment {
    
    private int amount;
    private boolean creditCard;
    
    public Payment (int amount, boolean creditCard) {
        this.amount = amount;
        this.creditCard = creditCard;
    }
}
