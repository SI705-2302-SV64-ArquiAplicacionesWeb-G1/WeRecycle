package pe.edu.upc.aww.werecycle.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.aww.werecycle.entities.Publication;

import java.time.LocalDate;
import java.util.List;

public interface IUPublicationService {
    public void insert(Publication publication);
    public List<Publication> list();
    public void delete(int idPublication);

    List<Publication> findBydatePublication(LocalDate datePublication);
    List<Publication> findBytitle(String title);
    public List<Publication> findByPublicationByType(@Param("type") String typeRecursotype);
    Integer CountPublicationByType();
}
