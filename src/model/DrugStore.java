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
public class DrugStore {
    
    public Catalogue catalogo;
    public ShoppingCart carro;
    public DrugStore (Catalogue catalogo , ShoppingCart carro) {
        this.catalogo = catalogo;
        this.carro = carro;
    }
}
