package hiber;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchNamebyPatternMatching {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Starting or Ending of name:");
		String ch1=sc.nextLine();
//		System.out.println("Enter last letter of name:");
//		char ch2=sc.next().charAt(0);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Student s where s.name like :name");
		q.setParameter("name", "%"+ch1+"%");
		
		List<Student> li=q.getResultList();

		for(Student s:li) {
			System.out.println(s);
		}
	}
}
