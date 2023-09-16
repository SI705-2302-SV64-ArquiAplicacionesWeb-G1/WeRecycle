package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.TicketPurchase;
import pe.edu.upc.aww.werecycle.entities.TypeUser;

import java.util.List;

public interface ITicketPurchaseService {

    public void insert(TicketPurchase ticketPurchase);

    public List<TicketPurchase> list();
}
