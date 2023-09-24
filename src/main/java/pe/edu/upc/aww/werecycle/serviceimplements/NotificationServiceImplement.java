package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Notification;
import pe.edu.upc.aww.werecycle.repositories.IUNotificationRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUNotificationService;

import java.util.List;

@Service
public class NotificationServiceImplement implements IUNotificationService {
@Autowired
    private IUNotificationRepository nO;

    @Override
    public void insert(Notification notification) {
        nO.save(notification);
    }

    @Override
    public List<Notification> list() {
        return nO.findAll();
    }

    @Override
    public void delete(int idNotification) {
    nO.deleteById(idNotification);
    }

    
}
