package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Useror")
public class Useror  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "userName", nullable = false,length = 50)
    private String userName;
    @Column(name = "userPassword", nullable = false,length = 100)
    private String userPassword;
    @Column(name = "userEmail", nullable = false,length = 100)
    private String userEmail;
    @Column(name = "userAge",nullable = false)
    private LocalDate userAge;
    @ManyToOne
    @JoinColumn(name = "idRol")
    private Roles roles;
    @OneToOne
    @JoinColumn(name = "idUbication")
    private Ubication ubicationUser;



   /* @ManyToMany
    @JoinTable(
        name = "Useror_Events", // Nombre de la tabla de relación
        joinColumns = @JoinColumn(name = "user_id"), // Columna que hace referencia a Useror
        inverseJoinColumns = @JoinColumn(name = "event_id") // Columna que hace referencia a Events
    )*/


    //private Set<Events> followedEvents = new HashSet<>();

   /* public Set<Events> getFollowedEvents() {
        return followedEvents;
    }

    public void setFollowedEvents(Set<Events> followedEvents) {
        this.followedEvents = followedEvents;
    }
*/
    public Useror() {
    }

    public Useror(int idUser, String userName, String userPassword, String userEmail, LocalDate userAge, Roles roles, Ubication ubicationUser) {
        this.idUser = idUser;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.roles = roles;
        this.ubicationUser = ubicationUser;
        //this.followedEvents = followedEvents;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDate getUserAge() {
        return userAge;
    }

    public void setUserAge(LocalDate userAge) {
        this.userAge = userAge;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Ubication getUbicationUser() {
        return ubicationUser;
    }

    public void setUbicationUser(Ubication ubicationUser) {
        this.ubicationUser = ubicationUser;
    }

  /*  public Events getIdEvent(){
        return idEvent;
    }

    public void setIdEvent(int idEvent)
    {
        this.idEvent=idEvent;
    }*/
}