package pe.edu.upc.aww.werecycle.entities;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@Table(name = "Assesment")
public class Assessment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssessment;

@OneToOne
@JoinColumn(name = "idPublication")
    private Publication idPublication;

@ManyToOne
@JoinColumn (name = "idTypeAssesment")
    private TypeAssesment idTypeAssesment;



    public Assessment() {
    }

    public Assessment(int idAssessment, Publication idPublication, TypeAssesment idTypeAssesment) {
        this.idAssessment = idAssessment;
        this.idPublication = idPublication;
        this.idTypeAssesment = idTypeAssesment;
    }

    public int getIdAssessment() {
        return idAssessment;
    }

    public void setIdAssessment(int idAssessment) {
        this.idAssessment = idAssessment;
    }




    public Publication getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Publication idPublication) {
        this.idPublication = idPublication;
    }


    public TypeAssesment getIdTypeAssesment() {
        return idTypeAssesment;
    }

    public void setIdTypeAssesment(TypeAssesment idTypeAssesment) {
        this.idTypeAssesment = idTypeAssesment;
    }
}
