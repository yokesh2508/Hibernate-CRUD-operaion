package hiber;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchbyUSinputAge {
      static Scanner sc=new Scanner(System.in);
      public static void main(String[] args) {
		System.out.print("Enter the starting age:");
		int age1=sc.nextInt();
		System.out.print("Enter the Ending age:");
		int age2=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Student s where s.age between ?1 and?2");
		q.setParameter(1, age1);
		q.setParameter(2, age2);
		
		List<Student> li=q.getResultList();
		for(Student s:li) {
			System.out.println(s);
		}
	}     
}
