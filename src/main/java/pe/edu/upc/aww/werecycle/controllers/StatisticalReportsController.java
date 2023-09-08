package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.StatisticalReportsDTO;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUStatisticalReportsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/StatisticalReportsController")
public class StatisticalReportsController {
    @Autowired
    private IUStatisticalReportsService sR;

    @PostMapping
    public void registrar(@RequestBody StatisticalReportsDTO dto) {
        ModelMapper m = new ModelMapper();
        StatisticalReports sr = m.map(dto, StatisticalReports.class);
        sR.insert(sr);
    }

    @GetMapping
    public List<StatisticalReportsDTO> listar() {
        return sR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();return m.map(x,StatisticalReportsDTO.class);
        }).collect(Collectors.toList());
    }
}
