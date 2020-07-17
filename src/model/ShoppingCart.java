/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ShoppingCart {
    
    private Date deliveryTime;
    public ArrayList <Product> prods;
    public float totalPrice = 0;
    
    public ShoppingCart (Date deliveryTime) {
        this.deliveryTime = deliveryTime;
        prods = new ArrayList <Product> ();
    }
    
    public Date getTime () {
        return this.deliveryTime;
    }
    
    public void addProduct (Product añade) {
        prods.add(añade);
    }
    
    public void deleteProduct (Product name) {
        prods.remove(name);
    }
    
    public ArrayList<String> getProducts () {
        ArrayList <String> names = new ArrayList <String> ();
        for (int i = 0; i < prods.size(); i++) {
            names.add(prods.get(i).getName());
        }
        return names;
    }
    
    public void getProduct () {
        String productNames = "";
        for (int i = 0; i < prods.size(); i++) {
            productNames += prods.get(i).getName();
        }
    }
    
    public float getTotalPrice () {        
        for (int i = 0; i < prods.size(); i++) {
            totalPrice += prods.get(i).getPrice();
        }
        return totalPrice;
    }
}
