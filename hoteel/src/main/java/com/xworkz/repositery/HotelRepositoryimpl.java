package com.xworkz.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.OrderDTO;

@Repository
public class HotelRepositoryimpl implements HotelRepository {
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public HotelRepositoryimpl() {
		System.out.println("HotelRepository Implementation Running");
	}

	
	@Override
	public boolean save(OrderDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Save Running");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		//System.out.println(dto);
		return false;
		
	}

}