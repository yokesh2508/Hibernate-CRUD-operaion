package hiber;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchbyWeightOrder {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s order by s.weight");
	 
		List<Student> li=q.getResultList();
		for(Student s:li) {
			System.out.println(s);
		}
	}
}