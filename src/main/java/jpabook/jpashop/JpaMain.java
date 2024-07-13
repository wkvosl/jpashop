package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpabook.jpashop.domain.Member;


public class JpaMain {

	public static void main(String[] args) {
		//META-INF > persistencx.xml의 이름, <persistence-unit name="hello">
		//연결 확인, 자바 실행
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		 // 이 사이에서 동작코드 작성 : DB저장 등
		
			//jpa에서는 트랜젝션 안에서 작업해야함
			EntityTransaction tx = em.getTransaction();
//			tx.begin();
				
			try {
			
				String n = "HI";
				
				Member member1 = em.find(Member.class, 2L);
				System.out.println("그냥 조회 :"+member1.getName());
				
				if(!"".equals(n)) {
					member1.setName(n);
				}
				em.flush();
				
				System.out.println(member1.getName());
//				tx.commit();
				
			   }catch (Exception e) {
				   tx.rollback();
			   }finally {
				   em.close();
			}
		
		emf.close();
	}
	
}
