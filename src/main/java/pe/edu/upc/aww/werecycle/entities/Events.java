package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvent;
    @Column(name = "Date",nullable = false)
    private LocalDate Date;
    @Column(name = "Description",nullable = false,length = 200)
    private String Description;

    @Column(name = "NumberParticipant", nullable = false)
    private int NumberParticipant;

    @OneToOne
    @JoinColumn(name = "idUbication")
    private Ubication idUbication;

    public Events() {
    }

    public Events(int idEvent, LocalDate date, String description, int numberParticipant, Ubication idUbication) {
        this.idEvent = idEvent;
        Date = date;
        Description = description;
        NumberParticipant = numberParticipant;
        this.idUbication = idUbication;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getNumberParticipant() {
        return NumberParticipant;
    }

    public void setNumberParticipant(int numberParticipant) {
        NumberParticipant = numberParticipant;
    }

    public Ubication getIdUbication() {
        return idUbication;
    }

    public void setIdUbication(Ubication idUbication) {
        this.idUbication = idUbication;
    }
}

