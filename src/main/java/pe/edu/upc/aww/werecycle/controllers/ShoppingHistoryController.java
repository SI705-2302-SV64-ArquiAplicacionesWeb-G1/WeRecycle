package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.ShoppingHistoryDTO;
import pe.edu.upc.aww.werecycle.dtos.TicketPurchaseDTO;
import pe.edu.upc.aww.werecycle.entities.ShoppingHistory;
import pe.edu.upc.aww.werecycle.entities.TicketPurchase;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IShoppingHistoryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/shoppingHistoryController")
public class ShoppingHistoryController {
    @Autowired
    private IShoppingHistoryService shS;

    @PostMapping
    public void registrar(@RequestBody ShoppingHistoryDTO dto) {
        ModelMapper m = new ModelMapper();
        ShoppingHistory sh = m.map(dto, ShoppingHistory.class);
        shS.insert(sh);
    }

    @GetMapping
    public List<ShoppingHistoryDTO> listar() {
        return shS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,ShoppingHistoryDTO.class);
        }).collect(Collectors.toList());
    }
}
