package com.TrainingProject___.BookMyTrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TrainingProject___.BookMyTrip.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
