package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProfileDriver {
  public static void main(String[] args) {
	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		AccountId t= new AccountId();
		t.setEmail("abc");
		t.setPhono(123);
		
		Profile f= new Profile();
		f.setAge(23);
		f.setName("sanika");
		f.setId(t);
		
		entityTransaction.begin();
		entityManager.persist(f);
		entityTransaction.commit();
		
}
}
