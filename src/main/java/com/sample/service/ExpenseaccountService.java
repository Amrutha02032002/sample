package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sample.entity.Expenseaccount;
import com.sample.repository.ExpenseaccountRepository;

@Service
public class ExpenseaccountService {
    @Autowired
    private ExpenseaccountRepository expenseAccountRepository;

    public List<Expenseaccount> getAllExpenseaccounts() {
        return expenseAccountRepository.findAll();
    }
}
