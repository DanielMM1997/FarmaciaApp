package Model;

public class Product {
    
    public String name;
    private int code;
    private double price;
    private Prospect prospect;
    
    public Product (String name, double price, Prospect prospect) {
        this.name = name;
        this.price = price;
        this.prospect = prospect;
    }
    
    public double getPrice () {
        return price;
    }
    
    public String getCode () {
        String cod = Integer.toString(code);
        return cod;
    }
    
    public String getName() {
        return name;
    }
    
    public String getProspect () {
        return prospect.getDesc();
    }
    
    public String priceS() {
        String pri = Double.toString(price);
        return pri;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
}
