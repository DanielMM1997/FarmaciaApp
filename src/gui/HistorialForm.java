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

/**
 *
 * @author danie
 */
public class HistorialForm extends JFrame implements ActionListener{
    private List historialList, favoritosList;
    private JLabel lHistorial, lFavorito;
    private Button bAñadir, bAtras;
    
    public HistorialForm(){
        setVisible(true);
        setTitle("Historial de compras");
        setLayout(null);
        setBounds(300, 100, 495, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        historialList = new List();
        favoritosList = new List();
        lHistorial = new JLabel("Ultima compra");
        lFavorito = new JLabel("Productos favoritos");
        bAñadir = new Button("Añadir al carro");
        bAtras = new Button("Atras");
        
        add(historialList);
        add(favoritosList);
        add(lHistorial);
        add(lFavorito);
        add(bAñadir);
        add(bAtras);
        
        historialList.setBounds(20, 50, 150, 300);
        favoritosList.setBounds(300, 50, 150, 300);
        lHistorial.setBounds(50, 20, 100, 20);
        lFavorito.setBounds(320, 20, 130, 20);
        bAñadir.setBounds(182, 120, 100, 25);
        bAtras.setBounds(182, 390, 100, 25);
        
        bAñadir.addActionListener(this);
        bAtras.addActionListener(this);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HistorialForm historial = new HistorialForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAtras){
            setVisible(false);
        }
        if (e.getSource() == bAñadir){
            
        }
    }
    
}
