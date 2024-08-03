package com.sample.controller;


import com.sample.entity.Products;

import com.sample.entity.Services;
import com.sample.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;


	@GetMapping("/productsdata/get")
	public List<Products> getAllProductsData(){
		return productsService.getAllProducts();		
	}

	@PostMapping("/addproductsdata")
	public void addProducts(@RequestBody Products products) {
		productsService.addProducts(products);
    }
	@PutMapping("/updateproductsdata/{id}")
	public void updateProducts(@RequestBody Products products,@PathVariable int id) {
		productsService.updateProducts(products, id);
	}

	@DeleteMapping("/deleteproductsdata/{id}")
	public void deleteProducts(@PathVariable int id) {
		productsService.deleteProducts(id);
	}
}




//package com.sample.controller;
//
//import com.sample.entity.Products;
//import com.sample.repository.ProductsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/products")
//public class ProductsController {
//
//    @Autowired
//    private ProductsRepository productsRepository;
//
//    @PostMapping("/addproduct")
//    public Products createProduct(@RequestBody Products product) {
//        return productsRepository.save(product);
//    }
//
//    @GetMapping("/getproduct")
//    public List<Products> getAllProducts() {
//        return productsRepository.findAll();
//    }
//
//    
//
//    @PutMapping("/update/{id}")
//    public Products updateProduct(@PathVariable Long id, @RequestBody Products productDetails) {
//        Optional<Products> optionalProduct = productsRepository.findById(id);
//        if (optionalProduct.isPresent()) {
//            Products product = optionalProduct.get();
//            product.setProduct(productDetails.getProduct());
//            product.setQty(productDetails.getQty());
//            return productsRepository.save(product);
//        } else {
//            throw new RuntimeException("Product not found with id " + id);
//        }
//    }
//
//    @DeleteMapping("/deleteproducts/{id}")
//    public void deleteProduct(@PathVariable Long id) {
//        Optional<Products> optionalProduct = productsRepository.findById(id);
//        if (optionalProduct.isPresent()) {
//            productsRepository.delete(optionalProduct.get());
//        } else {
//            throw new RuntimeException("Product not found with id " + id);
//        }
//    }
//}
