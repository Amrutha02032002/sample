package com.sample.service;

import com.sample.entity.Inventory;
import com.sample.entity.Products;
import com.sample.entity.ReqBody;
import com.sample.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    
        /*Read operation*/
        public List<Products> getAllProducts() {
            return productsRepository.findAll();
        }
    
      
        /*Create operation*/
        public void addProducts(Products products) {
            Products newProducts = new Products();
            newProducts.setProduct(products.getProduct());
            newProducts.setQty(products.getQty());
            productsRepository.save(newProducts);
            
            System.out.println("Products data added successfully");
        }
    
        /*Update operation*/
        public void updateProducts(Products updatedProducts, long id) {
            Products existingProducts = productsRepository.findById(id).orElse(null);
            
            if (existingProducts != null) {
            	
				existingProducts.setProduct(updatedProducts.getProduct());
				existingProducts.setQty(updatedProducts.getQty());
               
            	productsRepository.save(existingProducts);
                System.out.println("Products data updated successfully");
            }
        }

        /*Delete operation*/

        public void deleteProducts(long id) {
        	productsRepository.deleteById(id);
        	System.out.println("products Data Deleted Successfully");

    }
}




//package com.sample.service;
//
//import com.sample.entity.Products;
//import com.sample.repository.ProductsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductsService {
//
//    @Autowired
//    private ProductsRepository productsRepository;
//
//    public Products createProduct(Products product) {
//        return productsRepository.save(product);
//    }
//
//    public List<Products> getAllProducts() {
//        return productsRepository.findAll();
//    }
//
//    public Optional<Products> getProductById(Long id) {
//        return productsRepository.findById(id);
//    }
//
//    public Products updateProduct(Long id, Products productDetails) {
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
//    public void deleteProduct(Long id) {
//    	productsRepository.deleteById(id);
//}
//}
