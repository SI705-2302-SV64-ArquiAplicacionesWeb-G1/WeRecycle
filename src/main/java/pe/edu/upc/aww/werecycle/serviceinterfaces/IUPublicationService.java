package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import pe.edu.upc.aww.werecycle.entities.Publication;

import java.util.List;
import java.util.Objects;

public interface IUPublicationService {
    public void insert(Publication publication);
    public List<Publication> list();
    public void delete(int idPublication);
    public List<PublicationLikesDTO>findPublicationsWithMostLikes();
}
