package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.dtos.PublicationDTO;
import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import pe.edu.upc.aww.werecycle.entities.Likes;
import pe.edu.upc.aww.werecycle.entities.Publication;
import pe.edu.upc.aww.werecycle.repositories.IUPublicationRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUPublicationService;
import java.util.List;
import java.util.Objects;

@Service
public class PublicationServiceImplement implements IUPublicationService {
@Autowired
    private IUPublicationRepository pU;

    @Override
    public void insert(Publication publication) {
    pU.save(publication);
    }

    @Override
    public List<Publication> list() {
        return pU.findAll();
    }

    @Override
    public void delete(int idPublication) {
    pU.deleteById(idPublication);
    }

    @Override
    public List<PublicationLikesDTO> findPublicationsWithMostLikes() {
        return pU.findPublicationLikesDTOWithMostLikes();
    }


}
