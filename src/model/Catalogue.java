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
public class Catalogue {
    
    private String name;
    public ArrayList <Product> products;
    public ArrayList <Category> categories;
    
    
    public Catalogue (String name) {
        this.name = name;
        products = new ArrayList <Product> ();
        categories = new ArrayList<Category> ();
    }
    
    
    public void addProduct (Product nuevo) {
        products.add(nuevo);
    }
    
    public void addCategory (Category cat) {
        categories.add(cat);
    }
    
    public ArrayList<String> getProducts() {
        ArrayList <String> names = new ArrayList <String> ();
        for (int i = 0; i < products.size(); i++) {
            names.add(products.get(i).getName());
        }
        return names;
    }
    public ArrayList <Category> getCategories () {
        return this.categories;
    }
    
    public ArrayList <String> getCategoriesStr () {
        ArrayList <String> names2 = new ArrayList <String> ();
        for (int i = 0; i < categories.size(); i++) {
            names2.add(categories.get(i).getName());
        }
        return names2;
    }
    public void getProduct () {
        String productNames = "";
        for (int i = 0; i < products.size(); i++) {
            productNames += products.get(i).getName();
        }
    }
}