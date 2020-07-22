package Model;

public class PurchaseState {
    
    public int state;
    public String state2;
    
    public PurchaseState (int state) {
        this.state = state;
        this.state2 = setState(state);
    }
    
    public String setState (int state) {
        if (state == 0) {
            state2 = "En proceso";
        }
        if (state == 1) {
            state2 = "Pagado";
        }
        if (state == 2) {
            state2 = "Entregado";
        }
        return state2;
    }
}
