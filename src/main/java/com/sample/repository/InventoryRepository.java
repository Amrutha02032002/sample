package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {}


