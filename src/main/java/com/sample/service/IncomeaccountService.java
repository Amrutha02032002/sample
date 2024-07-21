package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;
import com.sample.entity.Incomeaccount;

import com.sample.repository.IncomeaccountRepository;

@Service
public class IncomeaccountService {
    @Autowired
    private IncomeaccountRepository incomeaccountRepository;

    public List<Incomeaccount> getAllIncomeaccounts() {
        return incomeaccountRepository.findAll();
    }
}


