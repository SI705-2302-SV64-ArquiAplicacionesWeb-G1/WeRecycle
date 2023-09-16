package pe.edu.upc.aww.werecycle.serviceinterfaces;

import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;

import java.util.List;


public interface IEventsService {

    public void insert(Events events);

    public List<Events> list();

    public void delete(int idEvent);
}
