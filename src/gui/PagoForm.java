package gui;
import file.DataBase;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import model.*;

public class PagoForm extends JFrame implements ActionListener{
    private JLabel lNombre, lCorreo, lDomicilio, lTelefono, lNTarjeta, 
            lRegistrarse, lISeccion, lEntrega, lPeriodo, lSesion, fondo;
    private JTextField tNombre, tCorreo, tDomicilio, tTelefono, 
            tNTarjeta, tPrecio;
    private Button bAtras, bPagar, bRegistrarse, bISesion, bAyuda;
    private JRadioButton rbPuntual, rbSemanal, rbQuincenal, rbMensual;
    private ButtonGroup gb;
    private JTextArea lAyuda;
    private JMenu menu1;
    private JMenuBar menuBar;
    private JMenuItem mEditarDatos, mVerPeidos, mEditarCuenta, mCerrarSesion;
    private JPanel panel;
    public DrugStore farmacia;
    public FarmaciaForm farmaciaform;
    
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
        lAyuda.setEditable(false);
        tNombre = new JTextField("");
        tCorreo = new JTextField("");
        tDomicilio = new JTextField("");
        tTelefono = new JTextField("");
        tNTarjeta = new JTextField("");
        tPrecio = new JTextField("");
        bAtras = new Button("Atrás");
        bPagar = new Button("Realizar pago");
        bRegistrarse = new Button("Registrarse");
        bISesion = new Button("Iniciar sesión");
        bAyuda = new Button("?");
        lSesion = new JLabel("");
        lSesion.setFont(new Font("Tohamo", 3, 13));
        lSesion.setVisible(false);
        panel = new JPanel();
        panel.setLayout(null);
        rbPuntual = new JRadioButton("Puntual", true);
        rbSemanal = new JRadioButton("Semanal");
        rbQuincenal = new JRadioButton("Quincenal");
        rbMensual = new JRadioButton("Mensual");
        gb = new ButtonGroup();
        
        add(lNombre);
        add(lCorreo);
        add(lDomicilio);
        add(lTelefono);
        add(lNTarjeta);
        add(lEntrega);
        add(lPeriodo);
        add(tNombre);
        add(tCorreo);
        add(tDomicilio);
        add(tTelefono);
        add(tNTarjeta);
        add(tPrecio);
        add(bAtras);
        add(bPagar);
        add(bAyuda);
        add(rbPuntual);
        add(rbSemanal);
        add(rbQuincenal);
        add(rbMensual);
        add(lAyuda);
        add(lSesion);
        gb.add(rbPuntual);
        gb.add(rbSemanal);
        gb.add(rbQuincenal);
        gb.add(rbMensual);
        panel.add(lRegistrarse);
        panel.add(lISeccion);
        panel.add(bRegistrarse);
        panel.add(bISesion);
        add(panel);
        add(fondo);    
        menu1 = new JMenu("Opciones");
        menuBar = new JMenuBar();        
        mEditarDatos = new JMenuItem("Editar datos"); 
        mVerPeidos = new JMenuItem("Ver pedidos"); 
        mEditarCuenta = new JMenuItem("Editar cuenta"); 
        mCerrarSesion = new JMenuItem("Cerrar sesión");
        menu1.add(mEditarDatos);
        menu1.add(mVerPeidos); 
        menu1.add(mEditarCuenta);     
        menu1.add(mCerrarSesion);
        menuBar.add(menu1);
        
        lRegistrarse.setBounds(80, 12, 170, 20);
        lISeccion.setBounds(80, 38, 175, 20);
        lSesion.setBounds(310, 20, 200, 20);
        lEntrega.setBounds(100, 115, 140, 20);
        lPeriodo.setBounds(300, 140, 120, 20);
        lNombre.setBounds(30, 140, 60, 20);
        lCorreo.setBounds(40, 165, 50, 20);
        lDomicilio.setBounds(30, 215, 60, 20);
        lTelefono.setBounds(30, 240, 60, 20);
        lNTarjeta.setBounds(10, 265, 80, 20);
        lAyuda.setBounds(260, 80, 205, 52);
        tNombre.setBounds(100, 140, 140, 20);
        tCorreo.setBounds(100, 165, 140, 20);
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
        mEditarDatos.addActionListener(this);
        mVerPeidos.addActionListener(this); 
        mEditarCuenta.addActionListener(this); 
        mCerrarSesion.addActionListener(this);
        
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
            Registrarse regis = new Registrarse();
        }
        if (botonPulsado == bISesion) {
            IniciarSesion iniciar = new IniciarSesion(this);
            if (!iniciar.isPressCancel()) {
                DataBase db = DataBase.getDataBase("jdbc:sqlite:FarmaciaBD.db");
                db.open();
                Customer cus = db.getCustomer(iniciar.getNombre());
                db.close();
                ponerDatos(cus);
            }
        }
        if (botonPulsado == mCerrarSesion) {
            quitarDatos();
        }
    }
    
    
    
    public static void main(String[] args){
        PagoForm pagar = new PagoForm();
    }
    
    public void showPriceTotal(String precio){
        tPrecio.setText(precio);   
    }

    public void ponerDatos(Customer cus) {
        panel.setVisible(false);
        lSesion.setVisible(true);
        tNombre.setText(cus.getName());
        lSesion.setText(cus.getName());
        tCorreo.setText(cus.getEmail());
        tDomicilio.setText(cus.getAddress());
        tTelefono.setText(String.valueOf(cus.getTelephone()));
        tNTarjeta.setText(String.valueOf(cus.getCardNumber()));
        setJMenuBar(menuBar);
        tCorreo.setEditable(false);
    }
    
    public void quitarDatos() {
        tNombre.setText("");
        lSesion.setText("");
        lSesion.setVisible(false);
        tCorreo.setText("");
        tDomicilio.setText("");
        tTelefono.setText("");
        tNTarjeta.setText("");
        menuBar.setVisible(false);
        tCorreo.setEditable(true);
        panel.setVisible(true);
    }
}
