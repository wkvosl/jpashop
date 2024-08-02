package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Delivery {

	@Id
	@GeneratedValue
	private Long delivery_id;

	private String city;
	
	private String street;
	
	private String zipcode;
	
	private DeliveryStatus status;
	
	@OneToOne
	@JoinColumn(name = "delivery_id")
	private Order order;
	
	
	
}
