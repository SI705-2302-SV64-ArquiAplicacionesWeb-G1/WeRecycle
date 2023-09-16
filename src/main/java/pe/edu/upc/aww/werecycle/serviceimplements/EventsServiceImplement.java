package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.repositories.IEventsRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IEventsService;

import java.util.List;

@Service
public class EventsServiceImplement implements IEventsService {
    @Autowired
    private IEventsRepository eR;


    @Override
    public void insert(Events events) {
        eR.save(events);
    }

    @Override
    public List<Events> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEvent) {
        eR.deleteById(idEvent);
    }
}
