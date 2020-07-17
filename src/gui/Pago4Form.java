package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import model.*;
/**
 *
 * @author danie
 */
public class Pago4Form extends JFrame implements ActionListener{
    private JLabel lNombre, lCorreo, lCodigo, lDomicilio, lTelefono, lNTarjeta, 
            lSesion, lEntrega, lPeriodo, fondo;
    private JTextField tNombre, tCorreo, tCodigo, tDomicilio, tTelefono, 
            tNTarjeta;
    private Button bAtras, bPagar;
    private JRadioButton rbPuntual, rbSemanal, rbQuincenal, rbMensual;
    private ButtonGroup gb;
    private JMenu menu1;
    private JMenuBar menuBar;
    private JMenuItem item1, item2, item3, item4;
    private JFormattedTextField tPrecio;
    public DrugStore farmacia;
    public FarmaciaForm farmaciaform;
    public CuentasApp cuenta;
    
    public void assignDrugStore (DrugStore farmacia, FarmaciaForm farmaciaform) {
        this.farmacia = farmacia;
        this.farmaciaform = farmaciaform;
    }
    
    public void assing(CuentasApp cuenta){
        this.cuenta = cuenta;
    }
    
    public Pago4Form(){
        setBounds (400, 190, 487, 400);
        setTitle("Realizar pago");
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        initComponent();
        
    }
    
    private void initComponent(){
        lNombre = new JLabel(" Nombre:");
        lNombre.setOpaque(true);
        lCorreo = new JLabel(" E-mail:");
        lCorreo.setOpaque(true);
        lCodigo = new JLabel(" C. Postal:");
        lCodigo.setOpaque(true);
        lDomicilio = new JLabel(" Domicilio:");
        lDomicilio.setOpaque(true);
        lTelefono = new JLabel(" Telefono:");
        lTelefono.setOpaque(true);
        lNTarjeta = new JLabel("Num. Tarjeta:");
        lNTarjeta.setOpaque(true);
        lSesion = new JLabel();
        lSesion.setFont(new Font("Tohamo", 3, 13));
        lEntrega = new JLabel("Dirección de entrega");
        lEntrega.setOpaque(true);
        lPeriodo = new JLabel("Fijar periodicidad");
        fondo = new JLabel();
        
        tNombre = new JTextField("");
        tCorreo = new JTextField("");////////////////
        tCodigo = new JTextField("");
        tDomicilio = new JTextField("");
        tTelefono = new JTextField("");
        tNTarjeta = new JTextField("");
        tPrecio = new JFormattedTextField();
        tPrecio.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(NumberFormat.getCurrencyInstance())));
        bAtras = new Button("Atrás");
        bPagar = new Button("Realizar Pago");
        rbPuntual = new JRadioButton("Puntual");
        rbPuntual.setContentAreaFilled(false);
        rbSemanal = new JRadioButton("Semanal");
        rbSemanal.setContentAreaFilled(false);
        rbQuincenal = new JRadioButton("Quincenal");
        rbQuincenal.setContentAreaFilled(false);
        rbMensual = new JRadioButton("Mensual", true);
        rbMensual.setContentAreaFilled(false);
        gb = new ButtonGroup();
        menu1 = new JMenu("Opciones");
        menuBar = new JMenuBar();        
        item1 = new JMenuItem("Editar datos"); 
        item2 = new JMenuItem("Ver pedidos"); 
        item3 = new JMenuItem("Editar cuenta"); 
        item4 = new JMenuItem("Cerrar sesión");
        menu1.add(item1);
        menu1.add(item2); 
        menu1.add(item3);     
        menu1.add(item4);
        menuBar.add(menu1);
        setJMenuBar(menuBar);
        
        add(lNombre);
        add(lCorreo);
        add(lCodigo);
        add(lDomicilio);
        add(lTelefono);
        add(lNTarjeta);
        add(lSesion);
        add(lEntrega);
        add(lPeriodo);
        add(tNombre);
        add(tCorreo);
        add(tCodigo);
        add(tDomicilio);
        add(tTelefono);
        add(tNTarjeta);
        add(tPrecio);
        add(bAtras);
        add(bPagar);
        add(rbPuntual);
        add(rbSemanal);
        add(rbQuincenal);
        add(rbMensual);
        add(fondo);
        gb.add(rbPuntual);
        gb.add(rbSemanal);
        gb.add(rbQuincenal);
        gb.add(rbMensual);
        
        lSesion.setBounds(310, 20, 200, 20);
        lEntrega.setBounds(100, 70, 123, 20);
        lPeriodo.setBounds(325, 70, 180, 20);
        lNombre.setBounds(30, 95, 60, 20);
        lCorreo.setBounds(40, 120, 50, 20);
        lCodigo.setBounds(30, 145, 60, 20);
        lDomicilio.setBounds(30, 170, 60, 20);
        lTelefono.setBounds(30, 195, 60, 20);
        lNTarjeta.setBounds(10, 220, 80, 20);
        tNombre.setBounds(100, 95, 150, 20);
        tCorreo.setBounds(100, 120, 150, 20);
        tCodigo.setBounds(100, 145, 150, 20);
        tDomicilio.setBounds(100, 170, 150, 20);
        tTelefono.setBounds(100, 195, 150, 20);
        tNTarjeta.setBounds(100, 220, 150, 20);
        tPrecio.setBounds(370, 280, 70, 25);
        tPrecio.setEditable(false);
        bAtras.setBounds(50, 280, 70, 25);
        bPagar.setBounds(270, 280, 90, 25);
        rbPuntual.setBounds(320, 90, 100, 20);
        rbSemanal.setBounds(320, 110, 100, 20);
        rbQuincenal.setBounds(320, 130, 100, 20);
        rbMensual.setBounds(320, 150, 100, 20);     
        fondo.setBounds(0, -10, 500, 400);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/cajeroTarjeta3.jpg")));
        
        bAtras.addActionListener(this);
        bPagar.addActionListener(this);
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        item4.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        if (botonPulsado == bAtras){
            setVisible(false);
        }
        if (botonPulsado == bPagar){
            if (tNTarjeta.getText().isEmpty()){
                JOptionPane.showMessageDialog(bPagar, "Error al introducir los datos.",
                            "MSGError", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(bPagar, "Ha realizado la compra correctamente.\n"
                        + "A continuación le enviaremos un mensaje a su correo\n"
                        + "electrónico con la confirmación de su pedido.",
                            "", JOptionPane.INFORMATION_MESSAGE);
                farmaciaform.vaciar();
                setVisible(false);
            }            
        }
        if (botonPulsado == item1) {
            
        }
        if (botonPulsado == item2) {
            
        }
        if (botonPulsado == item3) {
            
        }
        if (botonPulsado == item4) {
            setVisible(false);
            PagoForm pago = new PagoForm();
        }
    }
    
    public static void main(String[] args){
        Pago4Form pagar = new Pago4Form();
    }
    
    public void showPriceTotal(){
        float precioT = 0;
        for (int i = 0; i < farmacia.carro.prods.size(); i++) {            
            precioT += farmacia.carro.prods.get(i).getPrice();
            tPrecio.setValue(precioT);           
        }
    }
}