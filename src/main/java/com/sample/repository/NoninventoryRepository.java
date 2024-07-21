package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.Noninventory;

public interface NoninventoryRepository extends JpaRepository<Noninventory, Integer> {

}
