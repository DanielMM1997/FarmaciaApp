package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Customer;
import Model.Product;
import Model.Prospect;

public class DataBase {
    private final String URL;
    private Connection connection = null;
    private static DataBase db;
    
    public static DataBase getDataBase(String URL) {
        if (db == null) {
            db = new DataBase(URL);
        }
        return db;
    }
    private DataBase(String URL) {
        this.URL = URL;
    }
    
    public void open() {
        try {
            this.connection = DriverManager.getConnection(this.URL);
        } catch (SQLException e){
            System.out.println("Error open: " + e.getMessage());
        }
    }

    public void close() {
        if (this.connection != null) {
            try {
                this.connection.close();
            } catch (SQLException e){
                System.out.println("Error close: " + e.getMessage());
            }
        }
    }

    public void selectProducts() {
        String SQL = "SELECT * FROM productos";
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultset = statement.executeQuery(SQL);
            System.out.println("ID\tNOMBRE\tPROSPECTO");
            while (resultset.next()) {
                System.out.println(resultset.getInt("ID") + "\t" +
                                   resultset.getString("Nombre") + "\t" + 
                                   resultset.getString("Precio") + "\t" + 
                                   resultset.getString("Prospecto"));
            }
        } catch (SQLException e) {
            System.out.println("Error select: " + e.getMessage());
        }
    }

    public void insertProduct(List<Product> lista) {
        String SQL = "INSERT INTO productos(Nombre, Precio, Prospecto) VALUES(?, ?, ?)";
        try {
            PreparedStatement prepareStatement = this.connection.prepareStatement(SQL);
            for (Product prod : lista) {
                prepareStatement.setString(1, prod.getName());
                prepareStatement.setDouble(2, prod.getPrice());
                prepareStatement.setString(3, prod.getProspect());
                prepareStatement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
    
    public void deleteProduct(int id) {
        String SQL = "DELETE FROM productos WHERE ID = " + '"' + id + '"';
        try {
            Statement statement = this.connection.createStatement();
            statement.executeUpdate(SQL);
        }catch (SQLException e) {
            System.out.println("Error eliminar: " + e.getMessage());
        }
    }
    
    public void deleteAll() {
        String SQL = "DELETE FROM productos";
        try {
            Statement statement = this.connection.createStatement();
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            System.out.println("Error eliminar todo: " + e.getMessage());
        }
    }
    
    public Customer verifyAccount(String email, String pw) {
        String SQL = "SELECT * FROM usuarios WHERE Correo = " + '"' + email + '"' +
                        " AND Contraseña = " + '"' + pw + '"';
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultset = statement.executeQuery(SQL);
            if (resultset.getString("Nombre") != null) {
                return new Customer (resultset.getString(2),
                                    resultset.getString(3),
                                    resultset.getString(4),
                                    resultset.getInt(5),
                                    resultset.getInt(6),
                                    resultset.getString(7));
            }
        } catch (SQLException ex) {
            System.out.println("Error eliminar todo: " + ex.getMessage());
        }
        return null;
    }
    
    public Customer getCustomer(String email) {
        String SQL = "SELECT * FROM usuarios WHERE Correo = " + '"' + email + '"';
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultset = statement.executeQuery(SQL);
            return new Customer (resultset.getString(2),
                                resultset.getString(3),
                                resultset.getString(4),
                                resultset.getInt(5),
                                resultset.getInt(6),
                                resultset.getString(7));
        } catch (SQLException ex) {
            System.out.println("Error en getCustomer: " + ex.getMessage());
        }
        return null;
    }
    
    public void insertCustomer(Customer cus) {
        String SQL = "INSERT INTO usuarios (Nombre, Correo, Domicilio, Telefono, NTarjeta, Contraseña)"
                        + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement prepareStatement = this.connection.prepareStatement(SQL);
            prepareStatement.setString(1, cus.getName());
            prepareStatement.setString(2, cus.getEmail());
            prepareStatement.setString(3, cus.getAddress());
            prepareStatement.setInt(4, cus.getTelephone());
            prepareStatement.setInt(5, cus.getTelephone());
            prepareStatement.setString(6, cus.getPassword());
            prepareStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
        
    }
    
    public List<Product> getProducts() {
        String SQL = "SELECT * FROM productos";
        List<Product> list = new ArrayList<>();
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultset = statement.executeQuery(SQL);
            while (resultset.next()) {
                list.add(new Product(resultset.getString("Nombre"),
                                    resultset.getDouble("Precio"),
                                    new Prospect(resultset.getString("Prospecto"))));
            }
        } catch (SQLException ex) {
            System.out.println("Error en getProducts(): " + ex.getMessage());
        }
        return list;
    }
}