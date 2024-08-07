package jpabook.jpashop.domain;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class Period {

	private LocalDateTime startDate;
	private LocalDateTime endtDate;

	//기본생성자
	public Period() {
		
	}
	
	public Period(LocalDateTime startDate, LocalDateTime endtDate) {
		super();
		this.startDate = startDate;
		this.endtDate = endtDate;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndtDate() {
		return endtDate;
	}
	public void setEndtDate(LocalDateTime endtDate) {
		this.endtDate = endtDate;
	}
}
