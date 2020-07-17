/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import model.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.NumberFormat;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
/**
 *
 * @author danie
 */
public class FarmaciaForm extends JFrame implements ActionListener{
    private JLabel catalogo, detalle, carrito, filtrar, nombre, fondo;
    private List catalogoList, carritoList;
    private JTextArea detalleList;
    private Button añadirProducto, quitarProducto, comprar, recetaE, historial;
    private JTextField receta;
    private JComboBox filtro;
    private JMenu menu1, menu2, menu3;
    private JMenuBar menuBar;
    private JMenuItem item1, item2, item3, item4, item5, item6, item7;
    private JScrollPane scroll;
    private JFormattedTextField precio;
    public DrugStore farmacia;
    public FarmaciaForm aplicacion;
    public CuentasApp cuentas;
    
    public void assignDrugStore (DrugStore farmacia) {
        this.farmacia = farmacia;
    }
    
    public void assignCuentas (CuentasApp cuentas){
        this.cuentas = cuentas;
    }
    
    public FarmaciaForm(){
        //Propiedades de la ventana principal
        setBounds(300, 100, 693, 510);
        setTitle("Farmacia Online");
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Instanciar todos los elementos
        catalogo = new JLabel("Catálogo");
        catalogo.setFont(new Font("Tahoma", 1, 14));
        detalle = new JLabel("Detalles");
        detalle.setFont(new Font("Tahoma", 1, 14));
        carrito = new JLabel("Carrito");
        carrito.setFont(new Font("Tahoma", 1, 14));
        filtrar = new JLabel("Filtrar por:");
        filtrar.setFont(new Font("Tahoma", 1, 14));
        nombre = new JLabel();
        nombre.setFont(new Font("Tohamo", 3, 14));
        fondo = new JLabel();
        catalogoList = new java.awt.List();
        detalleList = new JTextArea();
        detalleList.setEditable(false);
        scroll = new JScrollPane();
        scroll.setViewportView(detalleList);
        carritoList = new java.awt.List();
        añadirProducto = new Button("Añadir al carrito");
        quitarProducto = new Button("Quitar del carrito");
        comprar = new Button("Realizar compra");
        recetaE = new Button("Añadir con receta");
        historial = new Button("Mostrar historial");         
        precio = new JFormattedTextField();
        precio.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(NumberFormat.getCurrencyInstance())));
        precio.setEditable(false);
        receta = new JTextField();
        filtro = new JComboBox();
        filtro.setModel(new DefaultComboBoxModel<>(new String[] { 
            "Todos", "Cremas solares", "Higiene Bucal", "Infantil", "Pastillas", 
            "Suplementos", "Óptica", "Salud sexual", "Higiene corparal",
            "Higiene cabello", "Cosmética"}));       
        menuBar = new JMenuBar();            
        menu1 = new JMenu("Menu");        
        item1 = new JMenuItem("Registrarse"); 
        item2 = new JMenuItem("Iniciar sesión"); 
        item3 = new JMenu("Opciones");
        item4 = new JMenu("Configuración");
        item5 = new JMenuItem("Salir");
        item6 = new JMenuItem("Cerrar sesión");
        menu1.add(item1);
        menu1.add(item2); 
        menu1.add(item3);    
        menu1.add(item4);
        menu1.add(item6);
        menu1.add(item5);        
        menuBar.add(menu1);
        setJMenuBar(menuBar);
        
        //Añadir todos los elementos a la ventana
        add(catalogo);
        add(detalle);
        add(carrito);
        add(filtrar);
        add(catalogoList);
        //add(detalleList);
        add(carritoList);
        add(añadirProducto);
        add(quitarProducto);
        add(comprar);
        add(recetaE);
        add(historial);
        add(precio);
        add(receta);
        add(filtro);
        add(scroll);
        add(nombre);
        add(fondo);
        
        //Posicionar todos los elementos en la ventana
        catalogoList.setBounds(20, 60, 190, 320);
        carritoList.setBounds(390, 230, 240, 150);
        catalogo.setBounds(75, 35, 100, 20);
        detalle.setBounds(480, 35, 100, 20);
        carrito.setBounds(480, 205, 100, 20);
        nombre.setBounds(230, 10, 200, 20);
        filtrar.setBounds(230, 68, 100, 20);
        filtro.setBounds(230, 90, 130, 25);
        añadirProducto.setBounds(250, 240, 100, 25);
        quitarProducto.setBounds(250, 270, 100, 25);
        recetaE.setBounds(250, 320, 100, 25);
        comprar.setBounds(390, 410, 105, 25);
        //historial.setBounds(40, 410, 100, 25);
        precio.setBounds(510, 410, 70, 25);
        receta.setBounds(250, 350, 100, 25);
        scroll.setBounds(390, 60, 240, 120);
        fondo.setBounds(0, -20, 693, 520);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/farmaciaMujer6.jpg")));
        
        
        //añadir un listener a cada elemento
        catalogoList.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                catalogoListActionPerformed(e);
            }
        });
        
        filtro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filtroActionPerformed(e);
            }
        });
        
        añadirProducto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                añadirProductoActionPerformed(e);
            }
        });
        
        quitarProducto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                quitarProductoActionPerformed(e);
            }
        });
        
        recetaE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                recetaEActionPerformed(e);
            }
        });
        
        comprar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                comprarActionPerformed(e);
            }
        });
        
        carritoList.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                carritoListActionPerformed(e);
            }
        });
        /*
        historial.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                historialActionPerformed(e);
            }
        });*/
        
        item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                RegistrarseForm regis = new RegistrarseForm();
                regis.assing(cuentas);
            }
        });
        
        item2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                iniciarsesion();
            }
        });
        
        item5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        
        item6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nombre.setText("");
            }
        });
    }
    
    //Evento que origina cada elemento de la ventana
    private void catalogoListActionPerformed(ActionEvent e){
        Product selected;
        int active = catalogoList.getSelectedIndex();
        int active2 = filtro.getSelectedIndex();
        selected = farmacia.catalogo.categories.get(active2).prod.get(active);
        showProductDetails(selected);
    }
    
    private void filtroActionPerformed(ActionEvent e){
        showCategoryProducts();
    }
    
    public void iniciarsesion(){
        IniciarSesionForm iniciar = new IniciarSesionForm();
        iniciar.assignDrugStore(farmacia, this);
        iniciar.assing(cuentas);        
    }
    
    public void añadirProductoActionPerformed(ActionEvent e){
        int active = catalogoList.getSelectedIndex();
        int active2 = filtro.getSelectedIndex();
        if (active >= 0){
            Product selected = farmacia.catalogo.categories.get(active2).prod.get(active);
            farmacia.carro.addProduct(selected);   
        }
        showPriceTotal();
        showShoppingCart();
    }
    
    public void quitarProductoActionPerformed(ActionEvent e){
        if(farmacia.carro.prods.size() > 0){
            int active = carritoList.getSelectedIndex();
            if (active >= 0){
                Product selected = farmacia.carro.prods.get(active);
                farmacia.carro.deleteProduct(selected);
            }               
        }
        showPriceTotal();
        showShoppingCart();
    }
    
    public void recetaEActionPerformed(ActionEvent e){        
        if (receta.getText().equals("A123")) {
            farmacia.catalogo.products.get(49).setDiscount();
            farmacia.carro.addProduct(farmacia.catalogo.products.get(49));   
            showPriceTotal();
            showShoppingCart();
        } else if (receta.getText().equals("B123")) {
            farmacia.catalogo.products.get(24).setDiscount();
            farmacia.carro.addProduct(farmacia.catalogo.products.get(24));   
            showPriceTotal();
            showShoppingCart();
        } else if(receta.getText().equals("C123")) {
            farmacia.catalogo.products.get(15).setDiscount();
            farmacia.carro.addProduct(farmacia.catalogo.products.get(15));   
            showPriceTotal();
            showShoppingCart();
        } else {
            JOptionPane.showMessageDialog(receta, "El codigo introducido es incorrecto.",
                            "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void comprarActionPerformed(ActionEvent e){
        if (nombre.getText().equals("Cirenia Monedero Espino") && !precio.getText().isEmpty()){
            Pago2Form pagar2 = new Pago2Form();
            pagar2.assignDrugStore(farmacia, this);
            pagar2.showPriceTotal();            
        } else if (nombre.getText().equals("Daniel Martinez Muñoz") && !precio.getText().isEmpty()){
            Pago3Form pagar3 = new Pago3Form();
            pagar3.assignDrugStore(farmacia, this);
            pagar3.showPriceTotal();
        } else if (!precio.getText().isEmpty()){
            PagoForm pagar = new PagoForm();
            pagar.assignDrugStore(farmacia, this);
            pagar.assing(cuentas);
            pagar.showPriceTotal();
        }        
    }
    
    public void carritoListActionPerformed(ActionEvent e){
        Product selected;
        int active = carritoList.getSelectedIndex();
        selected = farmacia.carro.prods.get(active);
        showProductDetails(selected);
    }
    /*
    public void historialActionPerformed(ActionEvent e){
        HistorialForm historial = new HistorialForm();
    }*/
    
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
    
    public static void main (String[] args){
        FarmaciaForm aplicacion = new FarmaciaForm();
    }
    
    public void showCategoryProducts(){
        catalogoList.removeAll();
        if (filtro.getSelectedIndex() == 0){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(0).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.categories.get(0).prod.get(j).name);
            }
        }
        if (filtro.getSelectedIndex() == 1){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(1).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(1).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex() == 2){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(2).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(2).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex() == 3){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(3).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(3).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex() == 4){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(4).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(4).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex( ) == 5){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(5).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(5).getProducts().get(j));
            }
        } 
        if (filtro.getSelectedIndex() == 6){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(6).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(6).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex() == 7){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(7).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(7).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex() == 8){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(8).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(8).getProducts().get(j));
            }
        }
        if (filtro.getSelectedIndex( ) == 9){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(9).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(9).getProducts().get(j));
            }
        } 
        if (filtro.getSelectedIndex( ) == 10){
            for (int j = 0; j < farmacia.catalogo.getCategories().get(10).getProducts().size(); j++) {
                catalogoList.add(farmacia.catalogo.getCategories().get(10).getProducts().get(j));
            }
        } 
    }
    
    public void showAll () {
        catalogoList.removeAll();
        for (int i = 0; i < farmacia.catalogo.products.size(); i++) {
            catalogoList.add(farmacia.catalogo.products.get(i).getName());
        }        
    }
    
    public void showShoppingCart () {
        carritoList.removeAll();
        for (int i = 0; i < farmacia.carro.prods.size(); i++) {
            carritoList.add(farmacia.carro.prods.get(i).getName());
        }
    }
    
    public void showProductDetails (Product selected) {
        detalleList.removeAll();
        if (selected.getDiscount()){
            detalleList.setText(" Nombre: " + selected.getName() + "\n" + 
                            " Código: " + selected.getCode() + "\n" + 
                            " Prospecto: " + selected.getProspect() + "\n" + 
                            " Precio: " + selected.priceS() + " euros\n" +
                            " Este producto tiene un descuento del 30%");
        } else {
            detalleList.setText(" Nombre: " + selected.getName() + "\n" + 
                            " Código: " + selected.getCode() + "\n" + 
                            " Prospecto: " + selected.getProspect() + "\n" + 
                            " Precio: " + selected.priceS() + " euros");
        }
        
    }
    
    public void showPriceTotal(){
        float precioT = 0;
        for (int i = 0; i < farmacia.carro.prods.size(); i++) {            
            precioT += farmacia.carro.prods.get(i).getPrice();
            precio.setValue(precioT);            
        }
        if (farmacia.carro.prods.isEmpty()){
            precio.setText("");
        }
    }
    
    public void vaciar(){
        farmacia.carro.prods.clear();
        carritoList.removeAll();
        precio.setText("");
    }
    
    public void ponerNombre(String nom){
        nombre.setText(nom);
    }
}
