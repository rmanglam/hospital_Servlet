package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Hospital;



public class HospitalDao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 

	
	public void insert(Hospital hospital) {
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
	}
	
	
	public void update(int id, long ph)
	{
		Hospital hospital= entityManager.find(Hospital.class, id);
		if (hospital!=null)
		{
			entityTransaction.begin();
			hospital.setPhone(ph);
			entityManager.merge(hospital);
			entityTransaction.commit();
		}
		
		else
		{
			System.out.println("data not found");
		}
	}
	
	public void delete(int id)
	{
		Hospital hospital=entityManager.find(Hospital.class, id);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		
	}
}
