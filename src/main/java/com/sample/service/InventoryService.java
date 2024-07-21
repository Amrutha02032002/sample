package com.sample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sample.entity.Inventory;
import com.sample.repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
	private InventoryRepository inventoryRepo;
    
    /*Read operation*/
    public List<Inventory> getAllInventories() {
    	return inventoryRepo.findAll();
    }
    
    /*Create operation*/
    public void addInventory(Inventory inventory) {
    	inventoryRepo.save(inventory);
    	System.out.println(inventory.getCategory());
    	System.out.println("Inventory data added successfully");
    }
    
    /*Update operation*/
    public void updateInventory(Inventory updatedInventory, int id) {
    	Inventory existingInventory = inventoryRepo.findById(id).orElse(null);
    	
    	if (existingInventory != null) {
    		existingInventory.setAssetAccount(updatedInventory.getAssetAccount());
    		existingInventory.setDate(updatedInventory.getDate());
    		existingInventory.setName(updatedInventory.getName());
    		existingInventory.setSku(updatedInventory.getSku());
    		existingInventory.setCategory(updatedInventory.getCategory());
    		existingInventory.setQuantity(updatedInventory.getQuantity());
    		existingInventory.setReorder(updatedInventory.getReorder());
    		existingInventory.setDescription(updatedInventory.getDescription());
    		existingInventory.setSalesprice(updatedInventory.getSalesprice());
    		existingInventory.setIncomeAccount(updatedInventory.getIncomeAccount());
    		existingInventory.setSalestax(updatedInventory.getSalestax());
    		existingInventory.setPurchasinginformation(updatedInventory.getPurchasinginformation());
    		existingInventory.setCost(updatedInventory.getCost());
    		existingInventory.setExpenseAccount(updatedInventory.getExpenseAccount());
    		existingInventory.setPreferredVendor(updatedInventory.getPreferredVendor());
    		inventoryRepo.save(existingInventory);
    		System.out.println("Inventory data updated successfully");	
    	}
    }
    
    /*Delete operation*/
    public void deleteInventory(int id) {
    	inventoryRepo.deleteById(id);
    	System.out.println("Inventory Data Deleted Successfully");
    }
}

