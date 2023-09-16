package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "TicketPurchase")
public class TicketPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCode;

    @ManyToOne
    @JoinColumn(name = "idCodePurchase")
    private PurchaseRequest idCodePurchase;

    public TicketPurchase() {
    }

    public TicketPurchase(int idCode, PurchaseRequest idCodePurchase) {
        this.idCode = idCode;
        this.idCodePurchase = idCodePurchase;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public PurchaseRequest getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(PurchaseRequest idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }
}
