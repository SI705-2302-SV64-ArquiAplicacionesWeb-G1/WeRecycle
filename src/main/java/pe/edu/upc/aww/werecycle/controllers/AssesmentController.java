package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.AssesmentDTO;
import pe.edu.upc.aww.werecycle.entities.Assessment;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUAssesment;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/AssesmentController")
public class AssesmentController {
    @Autowired
    private IUAssesment aS;

    @PostMapping
    public void registrar(@RequestBody AssesmentDTO dto) {
        ModelMapper m = new ModelMapper();
        Assessment as = m.map(dto, Assessment.class);
        aS.insert(as);
    }

    @GetMapping
    public List<AssesmentDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AssesmentDTO.class);
        }).collect(Collectors.toList());
    }
}
