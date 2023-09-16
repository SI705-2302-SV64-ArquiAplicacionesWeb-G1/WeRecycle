package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.TicketPurchase;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ShoppingHistoryDTO {
    private int idShoppingHistory;

    private TicketPurchase idCode;

    public int getIdShoppingHistory() {
        return idShoppingHistory;
    }

    public void setIdShoppingHistory(int idShoppingHistory) {
        this.idShoppingHistory = idShoppingHistory;
    }

    public TicketPurchase getIdCode() {
        return idCode;
    }

    public void setIdCode(TicketPurchase idCode) {
        this.idCode = idCode;
    }
}
