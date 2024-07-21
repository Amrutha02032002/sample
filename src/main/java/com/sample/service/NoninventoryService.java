package com.sample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.Noninventory;
import com.sample.repository.NoninventoryRepository;

@Service
public class NoninventoryService {
	@Autowired
	private NoninventoryRepository noninventoryRepo;
	
	/*Read operation*/
	public List<Noninventory> getAllNoninventorys() {
		return noninventoryRepo.findAll();
	}
	
	/*create operation*/
	public void addNoninventory(Noninventory noninventory) {
		noninventoryRepo.save(noninventory);
		System.out.println("NonInventory data added successfully");
	}
	
	/*update operation*/
	public void updateNoninventory(Noninventory updatedNoninventory, int id) {
		
		Noninventory existingNoninventory =noninventoryRepo.findById(id).orElse(null);
		
		if(existingNoninventory !=null) {
			
			existingNoninventory.setName(updatedNoninventory.getName());
			existingNoninventory.setSku(updatedNoninventory.getSku());
			existingNoninventory.setCategory(updatedNoninventory.getCategory());
			existingNoninventory.setDescription(updatedNoninventory.getDescription());
			existingNoninventory.setSalesprice(updatedNoninventory.getSalestax());
			existingNoninventory.setIncomeaccount(updatedNoninventory.getIncomeaccount());
			existingNoninventory.setSalestax(updatedNoninventory.getSalestax());
			existingNoninventory.setPurchasinginformation(updatedNoninventory.getPurchasinginformation());
			noninventoryRepo.save(existingNoninventory);
			System.out.println("noninventory data updated sucessfully");
		}
			
	}

	/*Delete operation*/
	
	public void deleteNoninventory(int id) {
		noninventoryRepo.deleteById(id);
		System.out.println("Noninventory deleted successfully");
		
		
		
		
	}
}
