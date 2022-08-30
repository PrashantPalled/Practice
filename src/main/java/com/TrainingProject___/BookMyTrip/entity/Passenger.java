package com.TrainingProject___.BookMyTrip.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "PASSENGERS",schema = "BOOK_MY_TRIP")
public class Passenger {
	
	@Id
	@GeneratedValue
    @Column(name="PASSENGER_ID")
	private Integer passengerId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="LUGGAGE")
	private Double luggage;
	
	

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(Integer passengerId, String name, Integer age, Double luggage) {
		super();
		this.passengerId = passengerId;
		this.name = name;
		this.age = age;
		this.luggage = luggage;
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getLuggage() {
		return luggage;
	}

	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}


}
