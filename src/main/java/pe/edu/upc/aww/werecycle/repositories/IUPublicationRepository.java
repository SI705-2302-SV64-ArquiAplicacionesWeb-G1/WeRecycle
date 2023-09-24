package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Publication;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IUPublicationRepository extends JpaRepository<Publication, Integer> {
    List<Publication> findBydatePublication(LocalDate datePublication);
    List<Publication> findBytitle(String title);

    @Query(value = "SELECT p.* FROM publication p " +
            "JOIN type_recurso tr ON p.id_type_recurso = tr.id_type_recurso " +
            "WHERE tr.type_recursotype = :type", nativeQuery = true)
    public List<Publication> findByPublicationByType(@Param("type") String typeRecursotype);

}
