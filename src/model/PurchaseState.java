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
public class PurchaseState {
    
    public int state;
    public String state2;
    
    public PurchaseState (int state) {
        this.state = state;
        this.state2 = setState(state);
    }
    
    public String setState (int state) {
        if (state == 0) {
            state2 = "En proceso";
        }
        if (state == 1) {
            state2 = "Pagado";
        }
        if (state == 2) {
            state2 = "Entregado";
        }
        return state2;
    }
}
