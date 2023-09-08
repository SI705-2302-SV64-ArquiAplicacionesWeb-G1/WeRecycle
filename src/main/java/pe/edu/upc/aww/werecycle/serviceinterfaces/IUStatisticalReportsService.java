package pe.edu.upc.aww.werecycle.serviceinterfaces;

import java.util.List;

public interface IUStatisticalReportsService {
    public void insert(StatisticalReports statisticalReports);
    public List<StatisticalReports>list();
    public void delete(int idStatisticalReports);
}
