package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.ShoppingHistory;
import pe.edu.upc.aww.werecycle.repositories.IShoppingHistoryRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IShoppingHistoryService;

import java.util.List;

@Service
public class ShoppingHistoryServiceImplement implements IShoppingHistoryService {

    @Autowired
    private IShoppingHistoryRepository shR;

    @Override
    public void insert(ShoppingHistory shoppingHistory) {
        shR.save(shoppingHistory);
    }

    @Override
    public List<ShoppingHistory> list() {
        return shR.findAll();
    }
}
