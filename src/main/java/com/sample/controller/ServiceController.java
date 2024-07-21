package com.sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.Services;
import com.sample.service.ServiceService;

@RestController
@RequestMapping("/servicesdata")
public class ServiceController {
	@Autowired
	private ServiceService serviceService;
	
	
	@GetMapping("/servicesdata/get")
	public List<Services> getAllServiceData(){
		return serviceService.getAllServices();		
	}
	
	@PostMapping("/addservicesdata")
	public void addServices(@RequestBody Services services) {
		serviceService.addServices(services);
	}
    
	@PutMapping("/updateservicedata/{id}")
	public void updateService(@RequestBody Services services,@PathVariable int id) {
		serviceService.updateService(services, id);
	}
	
	@DeleteMapping("/deleteservicedata/{id}")
    public void deleteInventory(@PathVariable int id) {
        serviceService.deleteService(id);
    }
	
	/* for drop down */
    @GetMapping("/servicecategories")
    public List<String> getCategories() {
        return Arrays.asList("Electronics", "Furniture", "Clothing", "Food");
    }
   
    @GetMapping("/serviceincomeAccounts")
    public List<String> getIncomeAccounts() {
        return Arrays.asList("Sales Revenue", "Service Revenue");
    }
    
    
    
    
    }
	
