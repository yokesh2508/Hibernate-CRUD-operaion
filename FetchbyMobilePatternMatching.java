package hiber;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchbyMobilePatternMatching {

	public static void main(String[] args) {
		 System.out.println("Enter Mobile:");
		 Scanner sc=new Scanner(System.in);
		 long mobile=sc.nextLong();
		 
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		 EntityManager em=emf.createEntityManager();
		 
		 Query q=em.createQuery("select s from Student s where str(s.mobile) like CONCAT('%',:phone,'%')");
		 q.setParameter("phone", mobile);
		 
		 List<Student> li=q.getResultList();
		 for(Student s:li) {
			 System.out.println(s);
		 }
	}
}
