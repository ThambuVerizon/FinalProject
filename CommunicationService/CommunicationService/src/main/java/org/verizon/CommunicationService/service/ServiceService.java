package org.verizon.CommunicationService.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationService.model.Servicecsp;
import org.verizon.CommunicationService.repo.ServiceRepo;
@Service
public class ServiceService {
	private final ServiceRepo servicerepo;
	@Autowired
	public ServiceService(ServiceRepo servicerepo) {
		this.servicerepo = servicerepo;
	}
	
	public List<Servicecsp> getAllService(){
		return servicerepo.findAll();
		
	}
	
	public Servicecsp getServiceById(Integer id) {
		return servicerepo.findById(id).orElse(null);
	}
	
	public Servicecsp createService (Servicecsp service) {
		return servicerepo.save(service);
		}
	
	public void deleteService(Integer id) {
		servicerepo.deleteById(id);
	}
	
	
}
