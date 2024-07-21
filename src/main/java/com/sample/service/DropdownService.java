package com.sample.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.*;
import com.sample.repository.*;

import java.util.List;

@Service
public class DropdownService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AssetaccountRepository assetAccountRepository;

    @Autowired
    private IncomeaccountRepository incomeAccountRepository;

    @Autowired
    private ExpenseaccountRepository expenseAccountRepository;

    @Autowired
    private PreferredvendorRepository preferredVendorRepository;

    // Category
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    // Asset Account
    public List<Assetaccount> getAssetAccounts() {
        return assetAccountRepository.findAll();
    }

    public Assetaccount addAssetAccount(Assetaccount assetAccount) {
        return assetAccountRepository.save(assetAccount);
    }

    public void deleteAssetAccount(int id) {
        assetAccountRepository.deleteById(id);
    }

    // Income Account
    public List<Incomeaccount> getIncomeAccounts() {
        return incomeAccountRepository.findAll();
    }

    public Incomeaccount addIncomeAccount(Incomeaccount incomeAccount) {
        return incomeAccountRepository.save(incomeAccount);
    }

    public void deleteIncomeAccount(int id) {
        incomeAccountRepository.deleteById(id);
    }

    // Expense Account
    public List<Expenseaccount> getExpenseAccounts() {
        return expenseAccountRepository.findAll();
    }

    public Expenseaccount addExpenseAccount(Expenseaccount expenseAccount) {
        return expenseAccountRepository.save(expenseAccount);
    }

    public void deleteExpenseAccount(int id) {
        expenseAccountRepository.deleteById(id);
    }

    // Preferred Vendor
    public List<Preferredvendor> getPreferredVendors() {
        return preferredVendorRepository.findAll();
    }

    public Preferredvendor addPreferredVendor(Preferredvendor preferredVendor) {
        return preferredVendorRepository.save(preferredVendor);
    }

    public void deletePreferredVendor(int id) {
        preferredVendorRepository.deleteById(id);
    }
}

