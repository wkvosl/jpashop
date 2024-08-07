package jpabook.jpashop.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(length = 10)
	private String city;
	
	@Column(length = 20)
	private String street;
	
	@Column(length = 5)
	private String zipcode;
	
	
	//기본생성자
    public Address() {
    	
    }
	
	public Address(String city, String street, String zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}
	
	//(비지니스 메서드)
	private String fullAddress() {
		return "(" + getZipcode() +")" + " " + getCity() + " " + getStreet();
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, street, zipcode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.getCity()) && Objects.equals(street, other.getStreet())
				&& Objects.equals(zipcode, other.getZipcode()); //JPA는 항상 메서드를 통해서 값을 호출할 수 있도록 한다. (이유 : 프록시일때 동등비교를 할 수 있다.)
	}

	
}
