package pe.edu.upc.aww.werecycle.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.RecyclingCenterDTO;
import pe.edu.upc.aww.werecycle.entities.RecyclingCenter;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IURecyclingCenterService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/RecyclingCenterController")
public class RecyclingCenterController {


    @Autowired
    private IURecyclingCenterService rC;

    @PostMapping
    public void registrar(@RequestBody RecyclingCenterDTO dto) {
        ModelMapper m = new ModelMapper();
        RecyclingCenter rc = m.map(dto, RecyclingCenter.class);
        rC.insert(rc);
    }

    @GetMapping
    public List<RecyclingCenterDTO> listar() {
        return rC.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RecyclingCenterDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{idRecyclingCenter}")
    public void eliminar(@PathVariable("idRecyclingCenter") Integer idRecyclingCenter){
        rC.delete(idRecyclingCenter);
    }

    public void modificar(@RequestBody RecyclingCenterDTO dto){
        ModelMapper m = new ModelMapper();
        RecyclingCenter RC =m.map(dto,RecyclingCenter.class);
        rC.insert(RC);
    }
}
