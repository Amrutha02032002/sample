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

import com.sample.entity.Noninventory;
import com.sample.service.NoninventoryService;

@RestController
@RequestMapping("/noninventory")
/*@CrossOrigin(origins = "*")*/
public class NoninventoryController {
    @Autowired
	private NoninventoryService noninventoryService;
	
    @GetMapping("/noninventorys/get")
    public List<Noninventory> getAllNoninventoryData(){
    	return noninventoryService.getAllNoninventorys();
    }
    
    @PostMapping("/addNoninventory")
    public void addNoninventory(@RequestBody Noninventory noninventory) {
    	noninventoryService.addNoninventory(noninventory);
    }
    
    @PutMapping("/updateNoninventory/{id}")
    public void updatedNoninventory(@RequestBody Noninventory noninventory, @PathVariable int id) {
    	noninventoryService.updateNoninventory(noninventory, id);
    }
    
    @DeleteMapping("/deleteNoninventory/{id}")
    	public void deleteNoninventory(@PathVariable int id) {
    		noninventoryService.deleteNoninventory(id);
    	}
    
    /* for drop down */
    @GetMapping("/categories")
    public List<String> getCategories() {
        return Arrays.asList("Electronics", "Furniture", "Clothing", "Food");
    }
    
    @GetMapping("/incomeAccounts")
    public List<String> getIncomeAccounts() {
        return Arrays.asList("Sales Revenue", "Service Revenue");
    }
    }


