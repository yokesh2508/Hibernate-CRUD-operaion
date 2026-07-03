package hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateData {
       public static void main(String[] args) {
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
		  EntityManager em=emf.createEntityManager();
		  EntityTransaction et=em.getTransaction();
		  
		  
		  Student s=em.find(Student.class, 100);
		  if(s!=null) {
			   s.setWeight(67);
			   et.begin();
			   em.merge(s);
			   et.commit();
			   System.out.println("Data updated successfully");
			   System.out.println(s);
		  }
		  else {
			  System.out.println("Given ID not FOUND");
		  }
		  em.close();
	}
}
