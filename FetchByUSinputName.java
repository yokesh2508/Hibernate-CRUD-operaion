package hiber;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByUSinputName {
	
	    static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.print("Enter your Name:");
			String name=sc.next();
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			EntityManager em=emf.createEntityManager();
			
			Query q=em.createQuery("select s from Student s where s.name=?1");
			q.setParameter(1, name);
			
			Object o=q.getSingleResult();
			Student s=(Student) o;
			System.out.println(s);
	}
}
