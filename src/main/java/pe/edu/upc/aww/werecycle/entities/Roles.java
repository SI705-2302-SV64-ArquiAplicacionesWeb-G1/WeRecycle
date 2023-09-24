package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeUser;
    @Column(name = "typeAccount", length = 20, nullable = false)
    private String typeAccount;
    @Column(name = "stateType", nullable = false)
    private boolean stateType;

    public Roles() {
    }

    public Roles(int idTypeUser, String typeAccount, boolean stateType) {
        this.idTypeUser = idTypeUser;
        this.typeAccount = typeAccount;
        this.stateType = stateType;

    }

    public int getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(int idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public boolean isStateType() {
        return stateType;
    }

    public void setStateType(boolean stateType) {
        this.stateType = stateType;
    }


}