package com.sample.service;

import com.sample.entity.*;
import com.sample.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DropdownService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AssetaccountRepository assetaccountRepository;

    @Autowired
    private IncomeaccountRepository incomeaccountRepository;

    @Autowired
    private ExpenseaccountRepository expenseaccountRepository;

    @Autowired
    private PreferredvendorRepository preferredvendorRepository;

    // Category
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    // Asset Account
    public List<Assetaccount> getAssetaccounts() {
        return assetaccountRepository.findAll();
    }

    public Assetaccount addAssetaccount(Assetaccount assetaccount) {
        return assetaccountRepository.save(assetaccount);
    }

    public Assetaccount updateAssetAccount(Assetaccount assetaccount) {
        return assetaccountRepository.save(assetaccount);
    }

    public void deleteAssetaccount(int id) {
        assetaccountRepository.deleteById(id);
    }

    // Income Account
    public List<Incomeaccount> getIncomeaccounts() {
        return incomeaccountRepository.findAll();
    }

    public Incomeaccount addIncomeaccount(Incomeaccount incomeaccount) {
        return incomeaccountRepository.save(incomeaccount);
    }

    public Incomeaccount updateIncomeaccount(Incomeaccount incomeaccount) {
        return incomeaccountRepository.save(incomeaccount);
    }

    public void deleteIncomeaccount(int id) {
        incomeaccountRepository.deleteById(id);
    }

 // Expense Account
    public List<Expenseaccount> getExpenseaccounts() {
        return expenseaccountRepository.findAll();
    }

    public Expenseaccount addExpenseaccount(Expenseaccount expenseaccount) {
        return expenseaccountRepository.save(expenseaccount);
    }

    public Expenseaccount updateExpenseaccount(Expenseaccount expenseaccount) {
        return expenseaccountRepository.save(expenseaccount);
    }

    public void deleteExpenseaccount(int id) {
        expenseaccountRepository.deleteById(id);
    }
    // Preferred Vendor
    public List<Preferredvendor> getPreferredvendors() {
        return preferredvendorRepository.findAll();
    }

    public Preferredvendor addPreferredvendor(Preferredvendor preferredvendor) {
        return preferredvendorRepository.save(preferredvendor);
    }

    public Preferredvendor updatePreferredvendor(Preferredvendor preferredvendor) {
        return preferredvendorRepository.save(preferredvendor);
    }

    public void deletePreferredvendor(int id) {
        preferredvendorRepository.deleteById(id);
    }
}
