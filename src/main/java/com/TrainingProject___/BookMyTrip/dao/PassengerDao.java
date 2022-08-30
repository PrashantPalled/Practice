package com.TrainingProject___.BookMyTrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TrainingProject___.BookMyTrip.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer> {

}
