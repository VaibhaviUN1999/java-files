package com.xworkz.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.entity.BiscuitEntity;

@Repository
public class BiscuitRepoImpl implements BiscuitRepository {

	@Autowired
	public EntityManagerFactory entityManagerFactory; 
	
	public BiscuitRepoImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	public boolean save(BiscuitEntity entity) {
		System.out.println("Running save in repository");
		EntityManager entityManager =  this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

	public BiscuitEntity findById(int id) {
		System.out.println("Find By id in Repository... "+id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		BiscuitEntity feromDb = entityManager.find(BiscuitEntity.class, id);
		entityManager.close();
		return feromDb;
	} 

}