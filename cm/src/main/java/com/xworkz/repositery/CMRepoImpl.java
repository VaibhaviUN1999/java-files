package com.xworkz.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.CMDto;


	@Repository
	public class CMRepoImpl implements CMRepo {
		
		
		@Autowired
		private EntityManagerFactory entityManagerFactory;

		public CMRepoImpl () {
			System.out.println("Repository Implementation Running");
		}

		
		

		@Override
		public boolean save(CMDto dto) {
			System.out.println("Save Running");
			EntityManager entityManager = this.entityManagerFactory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
			entityManager.close();
			//System.out.println(dto);
			return true;
		}

	}

