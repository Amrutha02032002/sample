package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.entity.*;
import com.sample.service.DropdownService;

import java.util.List;

@RestController
@RequestMapping("/drop")
//@CrossOrigin(origins = "*")
public class DropdownController {

    @Autowired
    private DropdownService dropdownService;

    // Category
    @GetMapping("/getcategories")
    public List<Category> getCategories() {
        return dropdownService.getCategories();
    }

    @PostMapping("/addcategories")
    public Category addCategory(@RequestBody Category category) {
        return dropdownService.addCategory(category);
    }

    @PutMapping("/updatecategories/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category category) {
        category.setId(id); // Assuming Category entity has setId method
        return dropdownService.updateCategory(category);
    }

    @DeleteMapping("/deletecategories/{id}")
    public void deleteCategory(@PathVariable int id) {
        dropdownService.deleteCategory(id);
    }

    // Asset Account
    @GetMapping("/getassetAccounts")
    public List<Assetaccount> getAssetaccounts() {
        return dropdownService.getAssetaccounts();
    }

    @PostMapping("/addassetAccounts")
    public Assetaccount addAssetaccount(@RequestBody Assetaccount assetaccount) {
        return dropdownService.addAssetaccount(assetaccount);
    }

    @PutMapping("/updateassetAccounts/{id}")
    public Assetaccount updateAssetaccount(@PathVariable int id, @RequestBody Assetaccount assetaccount) {
        assetaccount.setId(id); // Assuming Assetaccount entity has setId method
        return dropdownService.updateAssetAccount(assetaccount);
    }

    @DeleteMapping("/deleteassetAccounts/{id}")
    public void deleteAssetaccount(@PathVariable int id) {
        dropdownService.deleteAssetaccount(id);
    }

    // Income Account
    @GetMapping("/getincomeAccounts")
    public List<Incomeaccount> getIncomeaccounts() {
        return dropdownService.getIncomeaccounts();
    }

    @PostMapping("/addincomeAccounts")
    public Incomeaccount addIncomeAccount(@RequestBody Incomeaccount incomeaccount) {
        return dropdownService.addIncomeaccount(incomeaccount);
    }

    @PutMapping("/updateincomeAccounts/{id}")
    public Incomeaccount updateIncomeaccount(@PathVariable int id, @RequestBody Incomeaccount incomeaccount) {
        incomeaccount.setId(id); // Assuming Incomeaccount entity has setId method
        return dropdownService.updateIncomeaccount(incomeaccount);
    }

    @DeleteMapping("/deleteincomeAccounts/{id}")
    public void deleteIncomeaccount(@PathVariable int id) {
        dropdownService.deleteIncomeaccount(id);
    }

    // Expense Account
    @GetMapping("/getexpenseAccounts")
    public List<Expenseaccount> getExpenseAccounts() {
        return dropdownService.getExpenseaccounts();
    }

    @PostMapping("/addexpenseAccounts")
    public Expenseaccount addExpenseaccount(@RequestBody Expenseaccount expenseaccount) {
        return dropdownService.addExpenseaccount(expenseaccount);
    }

    @PutMapping("/updateexpenseAccounts/{id}")
    public Expenseaccount updateExpenseaccount(@PathVariable int id, @RequestBody Expenseaccount expenseaccount) {
        expenseaccount.setId(id); // Assuming Expenseaccount entity has setId method
        return dropdownService.updateExpenseaccount(expenseaccount);
    }


    @DeleteMapping("/deleteexpenseAccounts/{id}")
    public void deleteExpenseaccount(@PathVariable int id) {
        dropdownService.deleteExpenseaccount(id);
    }

    // Preferred Vendor
    @GetMapping("/getpreferredVendors")
    public List<Preferredvendor> getPreferredVendors() {
        return dropdownService.getPreferredvendors();
    }

    @PostMapping("/addpreferredVendors")
    public Preferredvendor addPreferredVendor(@RequestBody Preferredvendor preferredVendor) {
        return dropdownService.addPreferredvendor(preferredVendor);
    }

    @PutMapping("/updatepreferredVendors/{id}")
    public Preferredvendor updatePreferredvendor(@PathVariable int id, @RequestBody Preferredvendor preferredvendor) {
        preferredvendor.setId(id); // Assuming Preferredvendor entity has setId method
        return dropdownService.updatePreferredvendor(preferredvendor);
    }

    @DeleteMapping("/deletepreferredVendors/{id}")
    public void deletePreferredvendor(@PathVariable int id) {
        dropdownService.deletePreferredvendor(id);
    }
    
 // Type
    @GetMapping("/gettype")
    public List<Type> getTypes() {
        return dropdownService.getTypes();
    }

    @PostMapping("/addtypes")
    public Type addType(@RequestBody Type type) {
        return dropdownService.addType(type);
    }

    @PutMapping("/updatetypes/{id}")
    public Type updateTpe(@PathVariable int id, @RequestBody Type type) {
        type.setId(id); 
        return dropdownService.updateType(type);
    }

    @DeleteMapping("/deletetypes/{id}")
    public void deleteType(@PathVariable int id) {
        dropdownService.deleteType(id);
    }
}
