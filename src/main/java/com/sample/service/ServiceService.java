package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.Services;
import com.sample.repository.ServiceRepository;

@Service
public class ServiceService {
	
	@Autowired
	private ServiceRepository serviceRepo;
	
	/*Read operation*/
	public List<Services> getAllServices(){
		return serviceRepo.findAll();	
	}
	
	/*create operation*/
public void addServices(Services services) {
	serviceRepo.save(services);
	System.out.println("customer data added sucessfully");
}

/*update operation*/
public void updateService(Services updatedService, int id) {
	Services existingServices=serviceRepo.findById(id).orElse(null);
	
	if(existingServices !=null) {
		existingServices.setName(updatedService.getName());
		existingServices.setSku(updatedService.getSku());
		existingServices.setCategory(updatedService.getCategory());
		existingServices.setDescription(updatedService.getDescription());
		existingServices.setSalesprice(updatedService.getSalesprice());
		existingServices.setIncomeaccount(updatedService.getIncomeaccount());
		existingServices.setSalestax(updatedService.getSalestax());
		existingServices.setPurchasinginformation(updatedService.getPurchasinginformation());
		serviceRepo.save(existingServices);
		System.out.println("service data updated successfully");		
	}		
}

/*Delete operation*/

public void deleteService(int id) {
	serviceRepo.deleteById(id);
	System.out.println("Inventory Data Deleted Successfully");

}
}
