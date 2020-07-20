package gui;
import file.DataBase;
import model.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.NumberFormat;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class FarmaciaForm extends JFrame{
    
    private JLabel catalogo, detalle, carrito, filtrar, nombre, fondo;
    private List catalogoList, carritoList;
    private JTextArea detalleList;
    private Button añadirProducto, quitarProducto, comprar, recetaE, historial;
    private JTextField receta;
    private JComboBox filtro;
    private JMenu menu1, menu2, menu3;
    private JMenuBar menuBar;
    private JMenuItem mRegistrarse, mIniSesion, mOpciones, mConfi, mSalir, mCerrarSesion, item7;
    private JScrollPane scroll;
    private JFormattedTextField precio;
    public DrugStore farmacia;
    public FarmaciaForm aplicacion;
    
    
    public void assign (DrugStore farmacia) {
        this.farmacia = farmacia;
    }
    
    public FarmaciaForm(){
        setBounds(300, 100, 693, 510);
        setTitle("Farmacia Online");
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponent();
        
    }
    
    private void initComponent() {
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
        catalogoList = new List();
        detalleList = new JTextArea();
        detalleList.setEditable(false);
        scroll = new JScrollPane();
        scroll.setViewportView(detalleList);
        carritoList = new List();
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
        mRegistrarse = new JMenuItem("Registrarse"); 
        mIniSesion = new JMenuItem("Iniciar sesión"); 
        mOpciones = new JMenu("Opciones");
        mConfi = new JMenu("Configuración");
        mSalir = new JMenuItem("Salir");
        mCerrarSesion = new JMenuItem("Cerrar sesión");
        menu1.add(mRegistrarse);
        menu1.add(mIniSesion); 
        menu1.add(mOpciones);    
        menu1.add(mConfi);
        menu1.add(mCerrarSesion);
        menu1.add(mSalir);        
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
        nombre.setBounds(220, 10, 200, 20);
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
        fondo.setIcon(new ImageIcon(getClass().getResource("/gui/farmaciaMujer6.jpg")));
        
        
        //añadir un listener a cada elemento
        catalogoList.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                catalogoListAction(e);
            }
        });
        
        filtro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCategoryProducts();
            }
        });
        
        añadirProducto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                añadirProductoAction(e);
            }
        });
        
        quitarProducto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                quitarProductoAction(e);
            }
        });
        
        recetaE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //recetaEActionPerformed(e);
            }
        });
        
        comprar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                comprarAction(e);
            }
        });
        
        carritoList.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                carritoListAction(e);
            }
        });
        /*
        historial.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                historialActionPerformed(e);
            }
        });*/
        
        mRegistrarse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Registrarse regis = new Registrarse();
            }
        });
        
        mIniSesion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                iniciarsesion();
            }
        });
        
        mSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        
        mCerrarSesion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nombre.setText("");
            }
        });
    }
    
    //Evento que origina cada elemento de la ventana
    private void catalogoListAction(ActionEvent e){
        Product selected;
        int active = catalogoList.getSelectedIndex();
        int active2 = filtro.getSelectedIndex();
        selected = farmacia.catalogo.categories.get(active2).prod.get(active);
        showProductDetails(selected);
    }
    
    public void iniciarsesion(){
        IniciarSesion iniciar = new IniciarSesion(FarmaciaForm.this);
        if (!iniciar.isPressCancel()) {
            nombre.setText(iniciar.getNombre());
        }
    }
    
    public void añadirProductoAction(ActionEvent e){
        int active = catalogoList.getSelectedIndex();
        int active2 = filtro.getSelectedIndex();
        if (active >= 0){
            Product selected = farmacia.catalogo.categories.get(active2).prod.get(active);
            farmacia.carro.addProduct(selected);   
        }
        showPriceTotal();
        showShoppingCart();
    }
    
    public void quitarProductoAction(ActionEvent e){
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
    /*
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
    */
    public void comprarAction(ActionEvent e){            
        if (!precio.getText().isEmpty() && nombre.getText().isEmpty()){
            PagoForm pagar = new PagoForm();
            pagar.showPriceTotal(precio.getText());
        } else if (!precio.getText().isEmpty() && !nombre.getText().isEmpty()){
            PagoForm pagar = new PagoForm();
            pagar.showPriceTotal(precio.getText());
            DataBase db = DataBase.getDataBase("jdbc:sqlite:FarmaciaBD.db");
            db.open();
            Customer cus = db.getCustomer(nombre.getText());
            db.close();
            pagar.ponerDatos(cus);
        }
    }
    
    public void carritoListAction(ActionEvent e){
        Product selected;
        int active = carritoList.getSelectedIndex();
        selected = farmacia.carro.prods.get(active);
        showProductDetails(selected);
    }
    /*
    public void historialActionPerformed(ActionEvent e){
        HistorialForm historial = new HistorialForm();
    }*/
    
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
        detalleList.setText(" Nombre: " + selected.getName() + "\n" + 
                        " Código: " + selected.getCode() + "\n" + 
                        " Prospecto: " + selected.getProspect() + "\n" + 
                        " Precio: " + selected.priceS() + " euros");
    }
    
    public void showPriceTotal(){
        if (farmacia.carro.prods.isEmpty()){
            precio.setText("");
            return;
        }
        float precioT = 0;
        for (int i = 0; i < farmacia.carro.prods.size(); i++) {            
            precioT += farmacia.carro.prods.get(i).getPrice();
            precio.setValue(precioT);            
        }
    }
    
    public void vaciar(){
        farmacia.carro.prods.clear();
        carritoList.removeAll();
        precio.setText("");
    }
}
