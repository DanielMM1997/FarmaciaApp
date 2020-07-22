package Model;

public class DrugStore {
    
    public Catalogue catalogo;
    public ShoppingCart carro;
    public DrugStore (Catalogue catalogo , ShoppingCart carro) {
        this.catalogo = catalogo;
        this.carro = carro;
    }
}
