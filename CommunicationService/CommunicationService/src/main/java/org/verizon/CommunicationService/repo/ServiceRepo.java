package org.verizon.CommunicationService.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CommunicationService.model.Servicecsp;
@Repository
public interface ServiceRepo extends JpaRepository<Servicecsp, Integer> {
}

