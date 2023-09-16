package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.EventsDTO;
import pe.edu.upc.aww.werecycle.dtos.FrequentQuestionsDTO;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IEventsService;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IFrequentQuestionsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/EventsControlller")
public class EventsController {
    @Autowired
    private IEventsService eS;

    @PostMapping
    public void registrar(@RequestBody EventsDTO dto) {
        ModelMapper m = new ModelMapper();
        Events e = m.map(dto, Events.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EventsDTO> listar() {
        return eS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ eS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody EventsDTO dto) {
        ModelMapper m = new ModelMapper();
        Events u = m.map(dto, Events.class);
        eS.insert(u);
    }


}
