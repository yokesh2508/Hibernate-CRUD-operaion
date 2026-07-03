package hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteData {
     public static void main(String[] args) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 
		 Student s=em.find(Student.class,100);
		 
		 if(s!=null) {
			 et.begin();
			 em.remove(s);
			 et.commit();
			 System.out.println("Data deleted successfully");
		 }
		 else {
			 System.out.println("Given ID not FOUND");
		 }
		 em.close();
		 
	}
} 
