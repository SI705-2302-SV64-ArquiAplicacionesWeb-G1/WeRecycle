package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.ShoppingHistory;
import pe.edu.upc.aww.werecycle.entities.TicketPurchase;

import java.util.List;

public interface IShoppingHistoryService {

    public void insert(ShoppingHistory shoppingHistory);

    public List<ShoppingHistory> list();
}
