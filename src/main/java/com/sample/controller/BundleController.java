package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sample.entity.Bundle;
import com.sample.service.BundleService;

@RestController
@RequestMapping("/bundles")
public class BundleController {

    @Autowired
    private BundleService bundleService;
    

  @GetMapping("/getbundle")
  public List<Bundle> getAllBundleData() {
    return bundleService.getAllBundles();
  }

    @PostMapping("/addbundle")
    public ResponseEntity<Bundle> addBundle(@RequestBody Bundle bundle) {
        try {
            Bundle savedBundle = bundleService.saveBundle(bundle);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedBundle);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/updatebundle/{id}")
    public ResponseEntity<Bundle> updateBundle(@PathVariable Long id, @RequestBody Bundle bundle) {
        try {
            Bundle updatedBundle = bundleService.updateBundle(id, bundle);
            return ResponseEntity.ok(updatedBundle);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}



//@GetMapping("/getbundledata")
//public List<Bundle> getAllBundleData() {
//  return bundleService.getAllBundles();
//}






//package com.sample.controller;
//
//import com.sample.entity.Bundle;
//import com.sample.entity.Products;
//import com.sample.repository.BundleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/bundles")
//public class BundleController {
//
//    @Autowired
//    private BundleRepository bundleRepository;
//
//    @PostMapping("/addbundle")
//    public Bundle createBundle(@RequestBody Bundle bundle) {
//        // Save the bundle and its products
//        for (Products product : bundle.getProducts()) {
//            product.setBundle(bundle);
//        }
//        return bundleRepository.save(bundle);
//    }
//
//    @GetMapping("/getbundle")
//    public List<Bundle> getAllBundles() {
//        return bundleRepository.findAll();
//    }
//
//   
//
//    @PutMapping("/updatebundle/{id}")
//    public Bundle updateBundle(@PathVariable Long id, @RequestBody Bundle bundleDetails) {
//        Optional<Bundle> optionalBundle = bundleRepository.findById(id);
//        if (optionalBundle.isPresent()) {
//            Bundle bundle = optionalBundle.get();
//            bundle.setName(bundleDetails.getName());
//            bundle.setSku(bundleDetails.getSku());
//            bundle.setDescription(bundleDetails.getDescription());
//
//            // Update products
//            bundle.getProducts().clear();
//            for (Products product : bundleDetails.getProducts()) {
//                product.setBundle(bundle);
//                bundle.getProducts().add(product);
//            }
//
//            return bundleRepository.save(bundle);
//        } else {
//            throw new RuntimeException("Bundle not found with id " + id);
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteBundle(@PathVariable Long id) {
//        Optional<Bundle> optionalBundle = bundleRepository.findById(id);
//        if (optionalBundle.isPresent()) {
//            bundleRepository.delete(optionalBundle.get());
//        } else {
//            throw new RuntimeException("Bundle not found with id " + id);
//        }
//    }
//}
