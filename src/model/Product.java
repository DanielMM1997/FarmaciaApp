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
public class Product {
    
    public String name;
    private int code;
    private StateOfProduct state;
    private float price;
    private Discount discount;
    private boolean hasDiscount;
    private Prospect prospect;
    
    public Product (String name, int code, float price, boolean hasDiscount, Prospect prospect) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.hasDiscount = hasDiscount;
        this.prospect = prospect;
    }
    
    public void Discount () {
        if (hasDiscount) {
            System.out.println("Tiene un descuento del " + discount);
        }else {
            System.out.println("Este producto no tiene descuento");
        }
    }
    
    public float getPrice () {
        if (hasDiscount){
            return price - (price*0.3f);
        }
        return price;
    }
    
    public String getCode () {
        String cod = Integer.toString(code);
        return cod;
    }
    
    public String getName() {
        return name;
    }
    
    public String getProspect () {
        return prospect.getDesc();
    }
    
    public String priceS () {
        String pri = Float.toString(price);
        return pri;
    }
    
    public boolean getDiscount () {
        return this.hasDiscount;
    }
    
    public void setDiscount(){
        this.hasDiscount = true;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
}
