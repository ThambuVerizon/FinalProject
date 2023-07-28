package org.verizon.CommunicationService.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationService.model.Servicee;
import org.verizon.CommunicationService.service.ServService;

@RestController
@RequestMapping("/api/Service")
public class ServiceController {
	private ServService servservice;
	@Autowired
	public ServiceController(ServService servservice) {
		this.servservice = servservice;
	}
	
	@RequestMapping("/allservice")
	public List<Servicee>getAllService(){
		return servservice.getAllService();
	}
	
	@PostMapping("/insert")
	public Servicee createService(@RequestBody Servicee service) {
		return servservice.createService(service);
	}
	
	@DeleteMapping("/{id}")
	public void deleteService( @PathVariable int id) {
		servservice.deleteService(id);
	}

}
