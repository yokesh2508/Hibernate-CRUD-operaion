package hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchbyName {
       public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Student s where s.name='rian' ");
		Object o=q.getSingleResult();
		Student s=(Student) o;
		System.out.print(s);
	}
}

//---Output---
//Hibernate: 
//    select
//        s1_0.id,
//        s1_0.age,
//        s1_0.mobile,
//        s1_0.name,
//        s1_0.weight 
//    from
//        Student s1_0 
//    where
//        s1_0.name='rian'
//Student [id=100, name=rian, age=23, mobile=9785641230, weight=68.54]
