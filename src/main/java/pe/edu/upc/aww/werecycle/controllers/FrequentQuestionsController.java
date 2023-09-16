package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.FrequentQuestionsDTO;
import pe.edu.upc.aww.werecycle.dtos.MaterialUserDTO;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;
import pe.edu.upc.aww.werecycle.entities.MaterialUser;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IFrequentQuestionsService;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUMaterialUser;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/frequentquestioncontroller")
public class FrequentQuestionsController {
    @Autowired
    private IFrequentQuestionsService fqS;

    @PostMapping
    public void registrar(@RequestBody FrequentQuestionsDTO dto) {
        ModelMapper m = new ModelMapper();
        FrequentQuestions fu = m.map(dto, FrequentQuestions.class);
        fqS.insert(fu);
    }

    @GetMapping
    public List<FrequentQuestionsDTO> listar() {
        return fqS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FrequentQuestionsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ fqS.delete(id);
    }

}