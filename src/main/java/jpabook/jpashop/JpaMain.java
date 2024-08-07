package jpabook.jpashop;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.type.LocalDateTimeType;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Book;
import jpabook.jpashop.domain.Member;


public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
				
			try {
				
				
				Member member = new Member();
				member.setAddress(new Address("충북","성안길","13548"));
				em.persist(member);
				
				tx.commit();
			   }catch (Exception e) {
				   tx.rollback();
			   }finally {
				   em.close();
			}
		
		emf.close();
	}
	
}
