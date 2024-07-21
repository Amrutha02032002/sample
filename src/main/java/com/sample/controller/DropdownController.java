package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.entity.*;
import com.sample.service.DropdownService;

import java.util.List;

@RestController
@RequestMapping("/drop")
/*@CrossOrigin(origins = "*")*/
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

    @DeleteMapping("/deletecategories/{id}")
    public void deleteCategory(@PathVariable int id) {
        dropdownService.deleteCategory(id);
    }

    // Asset Account
    @GetMapping("/getassetAccounts")
    public List<Assetaccount> getAssetAccounts() {
        return dropdownService.getAssetAccounts();
    }

    @PostMapping("/addassetAccounts")
    public Assetaccount addAssetAccount(@RequestBody Assetaccount assetAccount) {
        return dropdownService.addAssetAccount(assetAccount);
    }

    @DeleteMapping("/deleteassetAccounts/{id}")
    public void deleteAssetAccount(@PathVariable int id) {
        dropdownService.deleteAssetAccount(id);
    }

    // Income Account
    @GetMapping("/getincomeAccounts")
    public List<Incomeaccount> getIncomeAccounts() {
        return dropdownService.getIncomeAccounts();
    }

    @PostMapping("/addincomeAccounts")
    public Incomeaccount addIncomeAccount(@RequestBody Incomeaccount incomeAccount) {
        return dropdownService.addIncomeAccount(incomeAccount);
    }

    @DeleteMapping("/deleteincomeAccounts/{id}")
    public void deleteIncomeAccount(@PathVariable int id) {
        dropdownService.deleteIncomeAccount(id);
    }

    // Expense Account
    @GetMapping("/getexpenseAccounts")
    public List<Expenseaccount> getExpenseAccounts() {
        return dropdownService.getExpenseAccounts();
    }

    @PostMapping("/addexpenseAccounts")
    public Expenseaccount addExpenseAccount(@RequestBody Expenseaccount expenseAccount) {
        return dropdownService.addExpenseAccount(expenseAccount);
    }

    @DeleteMapping("/deleteexpenseAccounts/{id}")
    public void deleteExpenseAccount(@PathVariable int id) {
        dropdownService.deleteExpenseAccount(id);
    }

    // Preferred Vendor
    @GetMapping("/getpreferredVendors")
    public List<Preferredvendor> getPreferredVendors() {
        return dropdownService.getPreferredVendors();
    }

    @PostMapping("/addpreferredVendors")
    public Preferredvendor addPreferredVendor(@RequestBody Preferredvendor preferredVendor) {
        return dropdownService.addPreferredVendor(preferredVendor);
    }

    @DeleteMapping("/deletepreferredVendors/{id}")
    public void deletePreferredVendor(@PathVariable int id) {
        dropdownService.deletePreferredVendor(id);
    }
}
