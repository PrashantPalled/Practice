package com.TrainingProject___.BookMyTrip.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TrainingProject___.BookMyTrip.entity.BusDetails;



public interface BusDetailsDao  extends JpaRepository<BusDetails, Integer>{
	
	@Query("select b from BusDetails b where b.arrivalDepot = ?1 and b.departureDepot = ?2")
	public List<BusDetails> findByRouteDate(String sourceDepot,String destinationDepot);
	

}
