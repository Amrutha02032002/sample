package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sample.entity.Preferredvendor;
import com.sample.repository.PreferredvendorRepository;


@Service
public class PreferredvendorService {
    @Autowired
    private PreferredvendorRepository preferredVendorRepository;

    public List<Preferredvendor> getAllPreferredVendors() {
        return preferredVendorRepository.findAll();
    }
}
