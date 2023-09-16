package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "PymentMethod")
public class PymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idPymentMethod;

    @ManyToOne
    @JoinColumn(name = "idCodePurchase")
    public PurchaseRequest idCodePurchase;

    @ManyToOne
    @JoinColumn(name = "idTypeCard")
    public PymentMethod idTypeCard;

    public PymentMethod() {
    }

    public PymentMethod(int idPymentMethod, PurchaseRequest idCodePurchase, PymentMethod idTypeCard) {
        this.idPymentMethod = idPymentMethod;
        this.idCodePurchase = idCodePurchase;
        this.idTypeCard = idTypeCard;
    }

    public int getIdPymentMethod() {
        return idPymentMethod;
    }

    public void setIdPymentMethod(int idPymentMethod) {
        this.idPymentMethod = idPymentMethod;
    }

    public PurchaseRequest getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(PurchaseRequest idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }

    public PymentMethod getIdTypeCard() {
        return idTypeCard;
    }

    public void setIdTypeCard(PymentMethod idTypeCard) {
        this.idTypeCard = idTypeCard;
    }
}
