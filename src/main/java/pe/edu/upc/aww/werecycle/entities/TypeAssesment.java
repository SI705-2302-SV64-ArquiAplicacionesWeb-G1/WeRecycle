package pe.edu.upc.aww.werecycle.entities;
import javax.persistence.*;
@Entity
@Table (name = "TypeAssesment")

public class TypeAssesment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idTypeAssesment;

    @Column (name="Tipo")
    private String type;



    public TypeAssesment() {
    }

    public TypeAssesment(int idTypeAssesment, String type) {
        this.idTypeAssesment = idTypeAssesment;
        this.type = type;

    }


    public int getIdTypeAssesment() {
        return idTypeAssesment;
    }

    public void setIdTypeAssesment(int idTypeAssesment) {
        this.idTypeAssesment = idTypeAssesment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  }
