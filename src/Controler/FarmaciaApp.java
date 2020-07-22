package Controler;

import Model.DrugStore;
import Model.ShoppingCart;
import Model.Product;
import Model.Catalogue;
import Model.Category;
import Model.Date;
import View.FarmaciaForm;
import file.*;
import java.util.List;

public class FarmaciaApp {

    public static void main(String[] args){        
        Catalogue catalogue = new Catalogue ("DrugStore"); 
        //List<Product> lista = ProductsListReader.read("productos.txt");
        DataBase db = DataBase.getDataBase("jdbc:sqlite:FarmaciaBD.db");
        db.open();
        //db.deleteAll();
        //db.insertProduct(lista);
        List<Product> lista = db.getProducts();
        db.close();
        
        Category ca = new Category ("Todos");
        
        for (Product pro : lista) {
            catalogue.addProduct(pro);
            ca.addProductToCategory(pro);
        }
        
        Category ca1 = new Category("Cremas solares");
        Category ca2 = new Category("Higiene bucal");
        Category ca3 = new Category("Infantil");
        Category ca4 = new Category("Pastillas");
        Category ca5 = new Category("Suplementos");
        Category ca6 = new Category("Óptica");
        Category ca7 = new Category("Salud sexual");
        Category ca8 = new Category("Higiene corparal");
        Category ca9 = new Category("Higiene cabello");
        Category ca10 = new Category("Cosmética");
        
        catalogue.addCategory(ca);
        catalogue.addCategory(ca1);
        catalogue.addCategory(ca2);
        catalogue.addCategory(ca3);
        catalogue.addCategory(ca4);
        catalogue.addCategory(ca5);
        catalogue.addCategory(ca6);
        catalogue.addCategory(ca7);
        catalogue.addCategory(ca8);
        catalogue.addCategory(ca9);
        catalogue.addCategory(ca10);
        
        ShoppingCart shop = new ShoppingCart(new Date("15/10/2019"));        
        DrugStore farmacia = new DrugStore(catalogue, shop); 
        
        FarmaciaForm farmaciaForm = new FarmaciaForm();
        farmaciaForm.assign(farmacia); 
        farmaciaForm.showAll();        
    }
}