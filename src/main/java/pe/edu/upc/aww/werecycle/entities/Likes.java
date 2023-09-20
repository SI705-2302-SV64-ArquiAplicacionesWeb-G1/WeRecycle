package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "Likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLike;

    @ManyToOne
    @JoinColumn(name = "idPublication")
    private Publication idPublication;

    @Column(name = "countLikes",nullable = false)
    private int countLikes;

    public Likes() {
    }

    public Likes(int idLike, Publication idPublication, int countLikes) {
        this.idLike = idLike;
        this.idPublication = idPublication;
        this.countLikes = countLikes;
    }

    public int getIdLike() {
        return idLike;
    }

    public void setIdLike(int idLike) {
        this.idLike = idLike;
    }

    public Publication getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Publication idPublication) {
        this.idPublication = idPublication;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }
}
