package com.TrainingProject___.BookMyTrip.service;


import java.util.List;

import com.TrainingProject___.BookMyTrip.entity.BookingDetails;
import com.TrainingProject___.BookMyTrip.entity.BusDetails;
import com.TrainingProject___.BookMyTrip.entity.Passenger;
import com.TrainingProject___.BookMyTrip.entity.User;
import com.TrainingProject___.BookMyTrip.utils.UserAuth;





public interface UserService {
	
	
	public User addUser(User user);

	public void updateUser(User user);

	public User getUser(Integer userId);

	public void deleteUser(Integer userId);

	public User userLogin(UserAuth auth);

	public BookingDetails addBooking(BookingDetails booking, Integer userId, Integer busNumber);

	public void deleteBooking(Integer bookingId, Integer userId);

	public List<BookingDetails> getBookingByUserId(Integer userId);

	public BusDetails findByRouteAndDate(String arrivalDepot, String departureDepot, String date);
	
	public BusDetails getBusByBusNumber(Integer busNumber);
	
	public Passenger updatePassenger(Passenger passenger);

}
