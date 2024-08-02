package jpabook.jpashop;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.type.LocalDateTimeType;

import jpabook.jpashop.domain.Book;


public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
				
			try {
				
				Book book = new Book();
				book.setName("JPA");
				book.setAuthor("김영한");
				book.setCreatedBy("admin");
				book.setCreatedDate(LocalDateTime.now());
				em.persist(book);
				
				tx.commit();
			   }catch (Exception e) {
				   tx.rollback();
			   }finally {
				   em.close();
			}
		
		emf.close();
	}
	
}
