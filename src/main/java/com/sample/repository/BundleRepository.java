//package com.sample.repository;
//
//import com.sample.entity.Bundle;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface BundleRepository extends JpaRepository<Bundle, Integer> {
//}


package com.sample.repository;

import com.sample.entity.Bundle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BundleRepository extends JpaRepository<Bundle, Long> {
}
