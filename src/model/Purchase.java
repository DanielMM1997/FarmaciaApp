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
public class Purchase {
    
    private PurchaseState state;
    private Date dateOfDelivering;
    private boolean toHome;
    
    public Purchase (PurchaseState state, Date dateOfDelivering, boolean toHome) {
        this.state = state;
        this.dateOfDelivering = dateOfDelivering;
        this.toHome = toHome;
    }
}
