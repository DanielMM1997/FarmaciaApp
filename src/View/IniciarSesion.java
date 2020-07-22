package View;

import Controler.DataBase;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Model.Customer;
import org.apache.commons.codec.digest.DigestUtils;


public class IniciarSesion extends JDialog {
    
    private Button bAceptar, bCancelar;
    private JLabel lTitulo, lContraseña, lCorreo;
    private JPasswordField tContraseña;
    private JTextField tCorreo;
    private JPanel fondo;
    public PagoForm pago;
    private boolean iscancel;
    
    public void assingForm(PagoForm pago){
        this.pago = pago;
    }
    
    public IniciarSesion(JFrame j) {
        setResizable(false);
        setBounds(500, 300, 300, 220);
        setLayout(null);
        setModal(true);
        initComponents();
        setVisible(true);
    }
                       
    private void initComponents() {
        tCorreo = new JTextField();
        tContraseña = new JPasswordField();
        lTitulo = new JLabel("Iniciar Sesión");
        lCorreo = new JLabel("Correo E:");
        lContraseña = new JLabel("Contraseña:");
        bAceptar = new Button("Aceptar");
        bCancelar = new Button("Cancelar");
        fondo = new JPanel();
        add(lTitulo);
        add(lCorreo);
        add(tCorreo);
        add(lContraseña);
        add(tContraseña);
        add(bAceptar);
        add(bCancelar);
        add(fondo);

        this.setBackground(Color.yellow);//setBackground(new Color(44, 193, 198));
        lTitulo.setFont(new Font("Century Schoolbook", 1, 24));
        lTitulo.setBounds(60, 0, 210, 50);
        lCorreo.setFont(new Font("Tahoma", 0, 12));
        lCorreo.setBounds(40, 60, 70, 23);
        tCorreo.setBounds(110, 60, 140, 25);
        lContraseña.setFont(new Font("Tahoma", 0, 12));
        lContraseña.setBounds(40, 90, 80, 20);
        tContraseña.setBounds(110, 90, 140, 25);
        bAceptar.setBounds(161, 139, 70, 25);
        bCancelar.setBounds(49, 139, 70, 25);
        fondo.setBounds(0, 0, 300, 220);
        fondo.setBackground(new Color(44, 193, 198));
        
        tContraseña.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                tContraseñaKeyReleased(evt);
            }
        });
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarAction(evt);
            }
        });

        bCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bCancelAction(evt);
                iscancel = true;
            }
        });
    }                    

    private void bCancelAction(ActionEvent evt) {                                        
        setVisible(false);
    }                                       

    private void bAceptarAction(ActionEvent evt) {                                         
        comprobarCuenta();
    }                                        

    private void tContraseñaKeyReleased(KeyEvent evt) {                                        
        if (evt.getKeyChar() == '\n'){
            comprobarCuenta();
        }
    }                                       

    private void comprobarCuenta(){
        DataBase db = DataBase.getDataBase("jdbc:sqlite:FarmaciaBD.db");
        db.open();
        Customer cus = db.verifyAccount(tCorreo.getText(), DigestUtils.md5Hex(tContraseña.getText()));
        db.close();
        if (cus != null) {
            setVisible(false);
            try {
                if (pago.isVisible()){
                    pago.ponerDatos(cus);
                }
            } catch (Exception ex){}
        } else {
            JOptionPane.showMessageDialog(bAceptar, "Correo o Contraseña incorrecta",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    

    public String getCorreo() {
        return tCorreo.getText();
    }
    
    public boolean isPressCancel() {
        return this.iscancel;
    }
}
