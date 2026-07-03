package hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindData {
      public static void main(String[] args) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
		 EntityManager em =emf.createEntityManager();
		 
		 //find(class type, primary key value)
		 Student s=em.find(Student.class, 100);
		 System.out.println(s);
		 
		 
		 
	}
}
