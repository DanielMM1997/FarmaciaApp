/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class PagoForm extends JFrame implements ActionListener{
    private JLabel lNombre, lCorreo, lCodigo, lDomicilio, lTelefono, lNTarjeta, 
            lRegistrarse, lISeccion, lEntrega, lPeriodo, fondo;
    private JTextField tNombre, tCorreo, tCodigo, tDomicilio, tTelefono, 
            tNTarjeta;
    private Button bAtras, bPagar, bRegistrarse, bISesion, bAyuda;
    private JRadioButton rbPuntual, rbSemanal, rbQuincenal, rbMensual;
    private ButtonGroup gb;
    private JFormattedTextField tPrecio;
    private JTextArea lAyuda;
    private JPanel panel;
    public DrugStore farmacia;
    public FarmaciaForm farmaciaform;
    public CuentasApp cuentas;
    
    public void assignDrugStore (DrugStore farmacia, FarmaciaForm farmaciaform) {
        this.farmacia = farmacia;
        this.farmaciaform = farmaciaform;
    }
    
    public void assing(CuentasApp cuentas){
        this.cuentas = cuentas;
    }
    
    public PagoForm(){
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
        lRegistrarse = new JLabel("Si desea guardar sus datos");
        lRegistrarse.setFont(new Font ("Cambria", 1, 14));
        lISeccion = new JLabel("Si usted ya tiene una cuenta");
        lISeccion.setFont(new Font ("Cambria", 1, 14));
        lEntrega = new JLabel(" Dirección de entrega");
        lEntrega.setFont(new Font ("Cambria", 1, 14));
        lEntrega.setOpaque(true);
        lPeriodo = new JLabel(" Fijar periodicidad");
        lPeriodo.setFont(new Font ("Cambria", 1, 14));
        lPeriodo.setOpaque(true);
        fondo = new JLabel();
        lAyuda = new JTextArea();
        lAyuda.setOpaque(false);
        tNombre = new JTextField("");
        tCorreo = new JTextField("");
        tCodigo = new JTextField("");
        tDomicilio = new JTextField("");
        tTelefono = new JTextField("");
        tNTarjeta = new JTextField("");
        tPrecio = new JFormattedTextField();
        tPrecio.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(NumberFormat.getCurrencyInstance())));
        bAtras = new Button("Atrás");
        bPagar = new Button("Realizar pago");
        bRegistrarse = new Button("Registrarse");
        bISesion = new Button("Iniciar sesión");
        bAyuda = new Button("?");
        panel = new JPanel();
        rbPuntual = new JRadioButton("Puntual", true);
        rbSemanal = new JRadioButton("Semanal");
        rbQuincenal = new JRadioButton("Quincenal");
        rbMensual = new JRadioButton("Mensual");
        gb = new ButtonGroup();
        
        add(lNombre);
        add(lCorreo);
        add(lCodigo);
        add(lDomicilio);
        add(lTelefono);
        add(lNTarjeta);
        add(lRegistrarse);
        add(lISeccion);
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
        add(bRegistrarse);
        add(bISesion);
        add(bAyuda);
        add(rbPuntual);
        add(rbSemanal);
        add(rbQuincenal);
        add(rbMensual);
        add(lAyuda);
        add(panel);
        add(fondo);        
        gb.add(rbPuntual);
        gb.add(rbSemanal);
        gb.add(rbQuincenal);
        gb.add(rbMensual);
        
        lRegistrarse.setBounds(80, 12, 170, 20);
        lISeccion.setBounds(80, 38, 175, 20);
        lEntrega.setBounds(100, 115, 140, 20);
        lPeriodo.setBounds(300, 140, 120, 20);
        lNombre.setBounds(30, 140, 60, 20);
        lCorreo.setBounds(40, 165, 50, 20);
        lCodigo.setBounds(30, 190, 60, 20);
        lDomicilio.setBounds(30, 215, 60, 20);
        lTelefono.setBounds(30, 240, 60, 20);
        lNTarjeta.setBounds(10, 265, 80, 20);
        lAyuda.setBounds(260, 80, 205, 52);
        tNombre.setBounds(100, 140, 140, 20);
        tCorreo.setBounds(100, 165, 140, 20);
        tCodigo.setBounds(100, 190, 140, 20);
        tDomicilio.setBounds(100, 215, 140, 20);
        tTelefono.setBounds(100, 240, 140, 20);
        tNTarjeta.setBounds(100, 265, 140, 20);
        tPrecio.setBounds(370, 320, 70, 25);
        tPrecio.setEditable(false);
        bAtras.setBounds(50, 320, 70, 25);
        bPagar.setBounds(270, 320, 90, 25);
        bRegistrarse.setBounds(270, 10, 90, 22);
        bISesion.setBounds(270, 38, 90, 22);
        bAyuda.setBounds(430, 140, 20, 20);
        rbPuntual.setBounds(300, 160, 80, 20);
        rbSemanal.setBounds(300, 180, 80, 20);
        rbQuincenal.setBounds(300, 200, 82, 20);
        rbMensual.setBounds(300, 220, 80, 20);
        panel.setBounds(0, 0, 481, 76);
        panel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panel.setOpaque(false);
        fondo.setBounds(0, -9, 500, 400);
        fondo.setIcon(new ImageIcon(getClass().getResource("/gui/cajeroTarjeta3.jpg")));
        
        bAtras.addActionListener(this);
        bPagar.addActionListener(this);
        bRegistrarse.addActionListener(this);
        bISesion.addActionListener(this);
        
        MouseListener mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lAyuda.setText("  Te envian un correo avisando que\n"
                        +      "  tienes que volver a comprar dentro\n"
                        +      "  de siete, quince o treinta días. ");
                lAyuda.setOpaque(true);
                lAyuda.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lAyuda.setText("");
                lAyuda.setOpaque(false);
                lAyuda.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
            }
        };
        bAyuda.addMouseListener(mouse);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        if (botonPulsado == bAtras){
            setVisible(false);
        }
        if (botonPulsado == bPagar){
            if (tNTarjeta.getText().isEmpty() || tCorreo.getText().isEmpty()){
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
        if (botonPulsado == bRegistrarse) {
            RegistrarseForm regis = new RegistrarseForm();
            regis.assing(cuentas);
        }
        if (botonPulsado == bISesion) {
            IniciarSesionForm iniciar = new IniciarSesionForm();
            iniciar.assignDrugStore(farmacia, farmaciaform);
            iniciar.assing(cuentas);
            iniciar.assingForm(this);
        }
    }
    
    
    
    public static void main(String[] args){
        PagoForm pagar = new PagoForm();
    }
    
    public void showPriceTotal(){
        float precioT = 0;
        for (int i = 0; i < farmacia.carro.prods.size(); i++) {            
            precioT += farmacia.carro.prods.get(i).getPrice();
            tPrecio.setValue(precioT);   
        }       
    }
}
