package hiber;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindAll {
           public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgresql");
			EntityManager em=emf.createEntityManager();
			
			Query q=em.createQuery("select s from Student s");
			List<Student> stu=q.getResultList();
			System.out.println(stu);
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
//[Student [id=100, name=rian, age=23, mobile=9785641230, weight=68.54], Student [id=101, name=karan, age=23, mobile=9785784230, weight=72.54]]
