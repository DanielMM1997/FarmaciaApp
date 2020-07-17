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
public class StateOfProduct {
    private int state;
    private String state2;
    
    public StateOfProduct (int state) {
        this.state = state;
        this.state2 = setState(state);
    }
    
    public String setState (int state) {
        if (state == 0) {
            state2 = "Vendido";
        }
        if (state == 1) {
            state2 = "En stock";
        }
        if (state == 2) {
            state2 = "En camino";
        }
        return state2;
    }
}
