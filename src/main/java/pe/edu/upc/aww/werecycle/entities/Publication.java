package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "Publication")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublication;

    @Column(name = "title",length = 100,nullable = false)
    private String title;
    @OneToOne
    @JoinColumn(name = "id_TypeRecurso")
    private TypeRecurso id_TypeRecurso;
    @OneToOne
    @JoinColumn(name = "idUser")
    private Useror idUser;

    public Publication() {
    }

    public Publication(int idPublication, String title, TypeRecurso id_TypeRecurso, Useror idUser) {
        this.idPublication = idPublication;
        this.title = title;
        this.id_TypeRecurso = id_TypeRecurso;
        this.idUser = idUser;
    }

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TypeRecurso getId_TypeRecurso() {
        return id_TypeRecurso;
    }

    public void setId_TypeRecurso(TypeRecurso id_TypeRecurso) {
        this.id_TypeRecurso = id_TypeRecurso;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
