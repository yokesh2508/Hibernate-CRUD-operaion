package hiber;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Fetching {
       public static void main(String[] args) {
    	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
   		   EntityManager em=emf.createEntityManager();
   		   
   		   Query q=em.createQuery("select s.id,s.name,s.mobile from Student s");
   		   List<Object[]> li=q.getResultList();
   		   for(Object arr[] : li) {
   			   System.out.println("Id="+arr[0]);
   			System.out.println("name="+arr[1]);
   			System.out.println("mobile="+arr[2]);
   		   }
	}
}
