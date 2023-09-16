package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "TypeCard")
public class TypeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeCard;

    public TypeCard() {
    }

    public TypeCard(int typeCard) {
        this.typeCard = typeCard;
    }

    public int getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(int typeCard) {
        this.typeCard = typeCard;
    }
}
