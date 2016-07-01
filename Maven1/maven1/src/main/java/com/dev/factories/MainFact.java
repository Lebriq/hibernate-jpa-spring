package com.dev.factories;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.dev.beans.User;


public class MainFact {

	@PersistenceContext(unitName="Service-persistance")
	EntityManager entityManager;
	
	public  String inscrirUtilisateur(User user){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Service-persistance" );
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
		return "l'utilisateur "+ user.getId()+"  nom : "+user.getNom()+" est inscrit.";
	}
}
