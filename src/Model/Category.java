package Model;

import java.util.ArrayList;

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
