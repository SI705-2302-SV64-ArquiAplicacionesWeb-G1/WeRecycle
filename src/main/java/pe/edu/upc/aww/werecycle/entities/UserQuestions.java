package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserQuestions")
public class UserQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserQuestions;
    @ManyToOne
    @Column(name = "idFrequenQuestions")
    private FrequentQuestions idFrequenQuestions;

    @ManyToOne
    @Column(name = "idUser")
    private Useror idUser;

}
