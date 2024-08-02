package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Item {

	@Id
	@GeneratedValue
	@Column(name = "item_id")
	private Long Id;
	
	private String name;
	
	private int price;
	
	private int stockQuantity;

	@ManyToMany(mappedBy = "items")
	private List<Category> category =  new ArrayList<>();
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuntity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

}
