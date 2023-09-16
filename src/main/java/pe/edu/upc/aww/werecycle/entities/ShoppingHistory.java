package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "ShopingHistory")
public class ShoppingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idShoppingHistory;

    @ManyToOne
    @JoinColumn(name = "idCode")
    private TicketPurchase idCode;

    public ShoppingHistory() {
    }

    public ShoppingHistory(int idShoppingHistory, TicketPurchase idCode) {
        this.idShoppingHistory = idShoppingHistory;
        this.idCode = idCode;
    }

    public int getIdShoppingHistory() {
        return idShoppingHistory;
    }

    public void setIdShoppingHistory(int idShoppingHistory) {
        this.idShoppingHistory = idShoppingHistory;
    }

    public TicketPurchase getIdCode() {
        return idCode;
    }

    public void setIdCode(TicketPurchase idCode) {
        this.idCode = idCode;
    }
}
