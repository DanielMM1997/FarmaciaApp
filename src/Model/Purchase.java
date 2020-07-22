package Model;

public class Purchase {
    
    private PurchaseState state;
    private Date dateOfDelivering;
    private boolean toHome;
    
    public Purchase (PurchaseState state, Date dateOfDelivering, boolean toHome) {
        this.state = state;
        this.dateOfDelivering = dateOfDelivering;
        this.toHome = toHome;
    }
}
