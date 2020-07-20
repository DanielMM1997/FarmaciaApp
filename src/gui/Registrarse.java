package gui;

import file.DataBase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Customer;
import org.apache.commons.codec.digest.DigestUtils;

public class Registrarse extends JFrame {
    
    private Button bAceptar, bCancelar;
    private JLabel lNombre, lApellidos, lCorreo, lContraseña, lContraseña2, 
                    lDomicilio, lTelefono, lTarjeta, lAyuda;
    private JTextField tNombre, tApellidos, tCorreo, tDomicilio,
                        tTelefono, tTarjeta;
    private JPasswordField tContraseña, tContraseña2;
    
    public Registrarse() {
        initComponents();
        setBounds(450, 200, 350, 450);
        getContentPane().setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
                        
    private void initComponents() {
        lNombre = new JLabel("Nombre");
        tNombre = new JTextField();
        lApellidos = new JLabel("Apellidos");
        tApellidos = new JTextField();
        lCorreo = new JLabel("Correo electronico");
        tCorreo = new JTextField();
        lDomicilio = new JLabel("Domicilio(*)");
        tDomicilio = new JTextField();
        lTelefono = new JLabel("Telefono(*)");
        tTelefono = new JTextField();
        lContraseña = new JLabel("Contraseña");
        tContraseña = new JPasswordField();
        lContraseña2 = new JLabel("Confirmar contraseña");
        tContraseña2 = new JPasswordField();
        lTarjeta = new JLabel("Tajerta Credito(*)");
        tTarjeta = new JTextField();
        lAyuda = new JLabel("(*) Campos opcionales");
        bAceptar = new Button("Aceptar");
        bCancelar = new Button("Cancelar");

        add(lNombre);
        add(lApellidos);
        add(tNombre);
        add(tApellidos);
        add(lCorreo);
        add(tCorreo);
        add(lContraseña);
        add(tContraseña);
        add(lContraseña2);
        add(lDomicilio);
        add(lTelefono);
        add(tDomicilio);
        add(tTelefono);
        add(tContraseña2);
        add(lTarjeta);
        add(tTarjeta);
        add(lAyuda);
        add(bCancelar);
        add(bAceptar);

        lNombre.setBounds(30, 20, 47, 20);
        tNombre.setBounds(30, 40, 100, 25);
        lApellidos.setBounds(150, 20, 70, 22);
        tApellidos.setBounds(150, 40, 150, 25);
        lCorreo.setBounds(30, 70, 140, 20);
        tCorreo.setBounds(30, 90, 220, 25);
        lDomicilio.setBounds(30, 120, 110, 20);
        tDomicilio.setBounds(30, 140, 220, 25);
        lTelefono.setBounds(30, 170, 80, 20);
        tTelefono.setBounds(30, 190, 150, 25);
        lContraseña.setBounds(30, 220, 110, 20);
        tContraseña.setBounds(30, 240, 130, 25);
        lContraseña2.setBounds(180, 220, 140, 20);
        tContraseña2.setBounds(180, 240, 130, 25);
        lTarjeta.setBounds(30, 270, 150, 20);
        tTarjeta.setBounds(30, 290, 150, 25);
        lAyuda.setBounds(30, 320, 150, 20);
        bCancelar.setBounds(70, 360, 70, 25);
        bAceptar.setBounds(200, 360, 70, 25);

        bAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAceptarAction(evt);
            }
        });
        
        bCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);
            }
        });
    }                                                  

    private boolean validarDatos() {
        return true;
    }
    
    private void registrar() {
        String nombre = tNombre.getText() + tApellidos.getText();
        String correo = tCorreo.getText();
        String domicilio = tDomicilio.getText();
        int telefono;
        if (!tTelefono.getText().isEmpty()) {
            telefono = Integer.valueOf(tTelefono.getText());
        } else {
            telefono = 0;
        }
        int tarjeta;
        if(!tTarjeta.getText().isEmpty()) {
            tarjeta = Integer.valueOf(tTarjeta.getText());
        } else {
            tarjeta = 0;
        }
        String contraseña = DigestUtils.md5Hex(tContraseña.getText());
        DataBase db = DataBase.getDataBase("jdbc:sqlite:FarmaciaBD.db");
        db.open();
        db.insertCustomer(new Customer(nombre, correo, domicilio, telefono, tarjeta, contraseña));
        db.close();
        JOptionPane.showMessageDialog(bAceptar, "Se ha registrado correctamente",
                            "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void bAceptarAction(ActionEvent evt) {                                         
        if (validarDatos()) {
            registrar();
        } else {
            JOptionPane.showMessageDialog(bAceptar, "No se ha podido registrar",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                                                                  

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }
}
