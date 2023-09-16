package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "PurchaseRequest")
public class PurchaseRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCodePurchase;
    @ManyToOne
    @JoinColumn(name = "dRecyclableMaterial")
    private RecyclableMaterial idRecyclableMaterial;

    @ManyToOne
    @JoinColumn(name = "UserInd")
    private Useror idUser;

    public PurchaseRequest() {
    }

    public PurchaseRequest(int idCodePurchase, RecyclableMaterial idRecyclableMaterial, Useror idUser) {
        this.idCodePurchase = idCodePurchase;
        this.idRecyclableMaterial = idRecyclableMaterial;
        this.idUser = idUser;
    }

    public int getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(int idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }

    public RecyclableMaterial getIdRecyclableMaterial() {
        return idRecyclableMaterial;
    }

    public void setIdRecyclableMaterial(RecyclableMaterial idRecyclableMaterial) {
        this.idRecyclableMaterial = idRecyclableMaterial;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
