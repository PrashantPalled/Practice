package com.TrainingProject___.BookMyTrip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BUS_DETAILS", schema = "BOOK_MY_TRIP")
public class BusDetails {

	@Id
	@Column(name = "BUS_NUMBER")
	private Integer busNumber;

//	@NotNull(message = "Boarding Point cannot be null")
	@Column(name = "DEPARTURE_DEPOT")
	private String departureDepot;

//	@NotNull(message = "Arrival Point cannot be null")
	@Column(name = "ARRIVAL_DEPOT")
	private String arrivalDepot;
	@Column(name = "AVALIABLE_SEATS")
	private Integer availableSeats;

//	@NotNull(message = "daparture date cannot be null")
	@Column(name = "DEPARTURE_DATE")
	private String departureDate;

//	@NotNull(message = "arrival date cannot b null")
	@Column(name = "ARRIVAL_DATE")
	private String arrivalDate;

//	@NotNull(message = "Arival Time cannot be null")
	@Column(name = "ARRIVAL_TIME")
	private String arrivalTime;

//	@NotNull(message = "Boarding Time cannot be null")
	@Column(name = "DEPARTURE_TIME")
	private String departureTime;

//	@NotNull(message = "Bus Vendor cannot be null")
	@Column(name = "BUS_VENDOR")
	private String busVendor;

	@NotNull(message = "cost cannot be null")
	@Column(name = "COST")
	private Double cost;

	public BusDetails() {
		super();
	}

	public BusDetails(@NotNull(message = "Boarding Point cannot be null") String departureDepot,
			@NotNull(message = "Arrival Point cannot be null") String arrivalDepot, Integer availableSeats,
			@NotNull(message = "daparture date cannot be null") String departureDate,
			@NotNull(message = "arrival date cannot b null") String arrivalDate,
			@NotNull(message = "Arival Time cannot be null") String arrivalTime,
			@NotNull(message = "Boarding Time cannot be null") String departureTime,
			@NotNull(message = "Bus Vendor cannot be null") String busVendor, Double cost) {
		super();
		this.departureDepot = departureDepot;
		this.arrivalDepot = arrivalDepot;
		this.availableSeats = availableSeats;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.busVendor = busVendor;
		this.cost = cost;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(Integer busNumber) {
		this.busNumber = busNumber;
	}

	public String getDepartureDepot() {
		return departureDepot;
	}

	public void setDepartureDepot(String departureDepot) {
		this.departureDepot = departureDepot.toLowerCase();
	}

	public String getArrivalDepot() {
		return arrivalDepot;
	}

	public void setArrivalDepot(String arrivalDepot) {
		this.arrivalDepot = arrivalDepot.toLowerCase();
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getBusVendor() {
		return busVendor;
	}

	public void setBusVendor(String busVendor) {
		this.busVendor = busVendor;
	}

	@Override
	public String toString() {
		return "BusDetails [busNumber=" + busNumber + ", departureDepot=" + departureDepot + ", arrivalDepot="
				+ arrivalDepot + ", availableSeats=" + availableSeats + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", busVendor=" + busVendor + ", cost=" + cost + "]";
	}

}
