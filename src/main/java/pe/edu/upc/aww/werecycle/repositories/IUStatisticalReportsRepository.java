package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUStatisticalReportsRepository extends JpaRepository<StatisticalReports,Integer> {
}
