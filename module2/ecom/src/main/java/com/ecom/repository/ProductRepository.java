package com.ecom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecom.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	List<Product> findByCategory(String category);	
	
	Optional<Product> findByProductName(String productName);
	
	//filter products within the given range (for e.g , list all products within the price range 20000 to 50000)
	
	@Query("select p from Product p where p.productPrice between :lPrice and :uPrice")
	List<Product> findAllProductsWithinPriceRange(@Param("lPrice") double lowerPrice, @Param("uPrice") double upperPrice);
}


