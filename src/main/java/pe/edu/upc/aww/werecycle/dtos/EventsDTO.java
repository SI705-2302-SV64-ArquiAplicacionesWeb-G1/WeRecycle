package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Ubication;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class EventsDTO {
    private int idEvent;
    private LocalDate Date;
    private String Description;

    private int NumberParticipant;
    private Ubication idUbication;

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
