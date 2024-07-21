package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;
import com.sample.entity.Assetaccount;

import com.sample.repository.AssetaccountRepository;

@Service
public class AssetaccountService {
    @Autowired
    private AssetaccountRepository assetAccountRepository;

    public List<Assetaccount> getAllAssetaccounts() {
        return assetAccountRepository.findAll();
    }
}

