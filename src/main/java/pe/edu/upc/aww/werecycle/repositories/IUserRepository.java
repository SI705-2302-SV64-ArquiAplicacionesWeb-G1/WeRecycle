package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Useror;

@Repository
public interface IUserRepository extends JpaRepository<Useror,Integer> {
    public Useror findUserorByUserName(String username);
    @Query("select count(u.userName) from Useror u where u.userName = :username")
    public int buscarUsername(@Param("username") String nombre);
}