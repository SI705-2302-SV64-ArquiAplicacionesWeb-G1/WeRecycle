package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.EventsDTO;
import pe.edu.upc.aww.werecycle.dtos.PublicationDTO;
import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import pe.edu.upc.aww.werecycle.entities.Publication;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUPublicationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PublicationController")
public class PublicationController {
    @Autowired
    private IUPublicationService pU;

    @PostMapping
    public void registrar(@RequestBody PublicationDTO dto) {
        ModelMapper m = new ModelMapper();
        Publication pu = m.map(dto, Publication.class);
        pU.insert(pu);

    }

    @GetMapping
    public List<PublicationDTO> listar() {
        return pU.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{idPublication}")
    public void eliminar(@PathVariable("idPublication") Integer idPublication) {
        pU.delete(idPublication);
    }

    @PutMapping
    public void modificar(@RequestBody PublicationDTO dto) {
        ModelMapper m = new ModelMapper();
        Publication p = m.map(dto, Publication.class);
        pU.insert(p);
    }

    @GetMapping("/Publicacion-con-ma-like")
    public List<PublicationLikesDTO> findPublicationWithMostLikes() {
        return pU.findPublicationsWithMostLikes().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationLikesDTO.class);
        }).collect(Collectors.toList());
    }
}
