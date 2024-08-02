package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {

	private String author;
	private String isnb;
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsnb() {
		return isnb;
	}
	public void setIsnb(String isnb) {
		this.isnb = isnb;
	}
}
