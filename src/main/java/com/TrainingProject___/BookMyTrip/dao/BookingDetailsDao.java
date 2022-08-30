package com.TrainingProject___.BookMyTrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TrainingProject___.BookMyTrip.entity.BookingDetails;

public interface BookingDetailsDao  extends JpaRepository<BookingDetails, Integer>{

}
