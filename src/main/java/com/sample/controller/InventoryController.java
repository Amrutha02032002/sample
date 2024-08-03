//package com.sample.controller;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.sample.entity.Inventory;
//import com.sample.service.InventoryService;
//import com.sample.entity.ReqBody;
//
//@RestController
//@RequestMapping("/inventory")
////@CrossOrigin(origins = "*")
//public class InventoryController {
//    
//    @Autowired
//    private InventoryService inventoryService;
//    
//    @GetMapping("/getdata")
//    public List<Inventory> getAllInventoryData() {
//        return inventoryService.getAllInventories();
//    }
//    
//    @PostMapping("/addinventory")
//    public void addInventory(@RequestBody ReqBody inventory) {
//        inventoryService.addInventory(inventory);
//    }
//    
//   @PutMapping("/updateinventory/{id}")
//   public void updateInventory(@RequestBody Inventory inventory, @PathVariable int id) {
//       inventoryService.updateInventory(inventory, id);
//    }
//
//    @DeleteMapping("/deleteinventory/{id}")
//    public void deleteInventory(@PathVariable int id) {
//        inventoryService.deleteInventory(id);
//    }
//}
//
//
//
//
//

package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.entity.Inventory;
import com.sample.entity.ReqBody;
import com.sample.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    
    @Autowired
    private InventoryService inventoryService;
    
    @GetMapping("/getdata")
    public List<Inventory> getAllInventoryData() {
        return inventoryService.getAllInventories();
    }
    
    @PostMapping("/addinventory")
    public void addInventory(@RequestBody ReqBody inventory) {
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

    @GetMapping("/type/inventory")
    public List<Inventory> getInventoryItems() {
        return inventoryService.getInventoryByType("inventory");
    }

    @GetMapping("/type/noninventory")
    public List<Inventory> getNonInventoryItems() {
        return inventoryService.getInventoryByType("noninventory");
    }
}
