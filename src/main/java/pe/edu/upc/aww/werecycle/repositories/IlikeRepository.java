package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Likes;
import pe.edu.upc.aww.werecycle.entities.Publication;

import java.util.List;

@Repository
public interface IlikeRepository extends JpaRepository<Likes,Integer> {

}
