package com.TrainingProject___.BookMyTrip.service;



import java.util.List;

import com.TrainingProject___.BookMyTrip.entity.Admin;
import com.TrainingProject___.BookMyTrip.entity.BusDetails;
import com.TrainingProject___.BookMyTrip.entity.Passenger;
import com.TrainingProject___.BookMyTrip.utils.AdminAuth;



public interface AdminService {
	public Admin addAdmin(Admin admin);

	public Admin getAdmin(Integer adminId);

	public void deleteAdmin(Integer adminId);

	public Admin adminLogin(AdminAuth auth);

	public List<BusDetails> getAllBusDetails();

	public BusDetails addBusDetails(BusDetails details);

	public void deleteBus(Integer busNumber);

	public BusDetails updateBus(BusDetails details);
	
	public List<Passenger> getAllPassengers();
	
	public List<Passenger> getPassengersByBooking(Integer id);

}
