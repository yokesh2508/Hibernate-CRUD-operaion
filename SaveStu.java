package hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveStu {
       public static void main(String[] args) {
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
		  EntityManager em=emf.createEntityManager();
		  EntityTransaction et=em.getTransaction();
		  
		 // Student s=new Student(100,"rian",23,9785641230l,68.54);
		  
		  //save
//		  et.begin();
//		  em.persist(s);
//		  et.commit();
		  
		  //fetch
		  Student s1=em.find(Student.class, 100);
		  System.out.println(s1.getName()+ s1.getAge());
	}
}
