package com.springjpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springjpa.entity.Product;

@Repository
public class ProductDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void addProduct(Product product) {
		
		entityManager.persist(product);
	}

}
