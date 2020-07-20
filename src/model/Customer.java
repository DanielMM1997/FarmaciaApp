package model;

public class Customer {
    
    private String name;
    private String email;
    private String address;
    private int telephone;
    private int cardNumber;
    private String contraseña;
    
    public Customer (String name, String email, String address, 
                        int telephone, int cardNumber, String contraseña) {
        
        this.name = name;
        this.email = email;
        this.address = address;
        this.telephone = telephone;
        this.cardNumber = cardNumber;
        this.contraseña = contraseña;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public int getTelephone() {
        return this.telephone;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }
    
    public String getPassword() {
        return this.contraseña;
    }
}
