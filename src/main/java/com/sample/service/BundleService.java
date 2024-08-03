package com.sample.service;


import java.util.List;

//
//import com.sample.entity.Bundle;

//import com.sample.entity.ReqBody;
//import com.sample.repository.BundleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//
//@Service
//public class BundleService {
//
//    @Autowired
//    private BundleRepository bundleRepository;
//
//    /*Read Operation*/
//    public List<Bundle> getAllBundles() {
//        return bundleRepository.findAll();
//    }
//
//    
//    /*Create operation*/
//    public void addBundle(ReqBody bundle) {
//        Bundle newBundle = new Bundle();
//        
//        newBundle.setName(bundle.getName());
//        newBundle.setSku(bundle.getSku());
//        newBundle.setDescription(bundle.getDescription());
//        newBundle.setProducts_id(bundle.getProducts_id());
//        
//        bundleRepository.save(newBundle);
//        
//        System.out.println("Bundle data added successfully");
//    }
//    
//
//    /*Update operation*/
//    public void updateBundle(Bundle updatedBundle, int id) {
//        Bundle existingBundle = bundleRepository.findById(id).orElse(null);
//        
//        if (existingBundle != null) {
//            existingBundle.setName(updatedBundle.getName());
//            existingBundle.setSku(updatedBundle.getSku());
//            existingBundle.setDescription(updatedBundle.getDescription());
//            existingBundle.setProducts_id(updatedBundle.getProducts_id());;
//            bundleRepository.save(existingBundle);
//            System.out.println("Bundle data updated successfully");
//        }
//    }
//    
//    
//    /*Delete operation*/
//    public void deleteBundle(int id) {
//        bundleRepository.deleteById(id);
//        System.out.println("Bundle Data Deleted Successfully");
//    }
//}





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.Bundle;
import com.sample.repository.BundleRepository;

@Service
public class BundleService {

    @Autowired
    private BundleRepository bundleRepository;
    
    /*Read Operation*/
  public List<Bundle> getAllBundles() {
     return bundleRepository.findAll();
 }

    public Bundle saveBundle(Bundle bundle) {
        return bundleRepository.save(bundle);
    }

    public Bundle updateBundle(Long id, Bundle bundle) throws Exception {
        if (!bundleRepository.existsById(id)) {
            throw new Exception("Bundle not found with id " + id);
        }
        bundle.setId(id);
        return bundleRepository.save(bundle);
        
    }
}
