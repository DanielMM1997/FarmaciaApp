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
public class Category {
    
    public String name;
    public ArrayList <Product> prod;
    
    public Category (String name) {
        this.name = name;
        prod = new ArrayList <Product> ();
    }
    
    public String getName () {
        return this.name;
    }
    
    public void addProductToCategory(Product añadir) {
        prod.add(añadir);
    }
    
    public ArrayList<String> getProducts () {
        ArrayList <String> names = new ArrayList <String> ();
        for (int i = 0; i < prod.size(); i++) {
            names.add(prod.get(i).getName());
        }
        return names;
    }
}
