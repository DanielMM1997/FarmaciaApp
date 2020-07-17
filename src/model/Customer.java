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
public class Customer {
    
    private String name;
    private Prescription prescription;
    private boolean hasPrescription;
    
    public Customer (String name, boolean hasPrescription) {
        this.name = name;
        this.hasPrescription = hasPrescription;
    }
}
