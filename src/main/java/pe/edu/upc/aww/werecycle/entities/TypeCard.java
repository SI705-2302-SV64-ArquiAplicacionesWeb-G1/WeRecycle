package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "TypeCard")
public class TypeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeCard;

    @Column(name = "cardType", length = 20)
    private String cardType;

    public TypeCard() {
    }

    public TypeCard(int idTypeCard, String cardType) {
        this.idTypeCard = idTypeCard;
        this.cardType = cardType;
    }

    public int getIdTypeCard() {
        return idTypeCard;
    }

    public void setIdTypeCard(int idTypeCard) {
        this.idTypeCard = idTypeCard;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
