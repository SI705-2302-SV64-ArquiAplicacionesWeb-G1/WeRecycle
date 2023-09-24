package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.entities.Useror;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Useror,Integer> {
    List<Useror> findByUserName(String userName);
}