package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Publication;
import pe.edu.upc.aww.werecycle.repositories.IUPublicationRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUPublicationService;

import java.time.LocalDate;
import java.util.List;

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
    public List<Publication> findBydatePublication(LocalDate datePublication) {
        return   pU.findBydatePublication(datePublication);
    }

    @Override
    public List<Publication> findBytitle(String title) {
        return pU.findBytitle(title);
    }

    @Override
    public List<Publication> findByPublicationByType(String typeRecursotype) {
        return pU.findByPublicationByType(typeRecursotype);
    }


}
