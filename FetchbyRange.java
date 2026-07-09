package hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchbyRange {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Student s where s.weight between 70 and 80");
		Object o=q.getSingleResult();
		Student s=(Student) o;
		System.out.println(s);
	}
}

//---output---
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
//        s1_0.weight between 70 and 80
//Student [id=101, name=karan, age=23, mobile=9785784230, weight=72.54]
