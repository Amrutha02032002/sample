package com.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.entity.Inventory;
import com.sample.service.InventoryService;

@RestController
@RequestMapping("/inventory")
/*@CrossOrigin(origins = "*")*/
public class InventoryController {
    
    @Autowired
    private InventoryService inventoryService;
    
    @GetMapping("/get")
    public List<Inventory> getAllInventoryData() {
        return inventoryService.getAllInventories();
    }
    
    @PostMapping("/addinventorydata")
    public void addInventory(@RequestBody Inventory inventory) {
    	System.out.println(inventory);
        inventoryService.addInventory(inventory);
    }
    
    @PutMapping("/updateinventory/{id}")
    public void updateInventory(@RequestBody Inventory inventory, @PathVariable int id) {
        inventoryService.updateInventory(inventory, id);
    }

    @DeleteMapping("/deleteinventory/{id}")
    public void deleteInventory(@PathVariable int id) {
        inventoryService.deleteInventory(id);
    }
}

