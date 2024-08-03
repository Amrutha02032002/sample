//package com.sample.repository;
//
//import com.sample.entity.Products;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ProductsRepository extends JpaRepository<Products, Integer> {
//}


package com.sample.repository;

//import com.sample.entity.Products;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface ProductsRepository extends JpaRepository<Products, Long> {
//}
	import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.Products;

	public interface ProductsRepository extends JpaRepository<Products, Long> {
	}


