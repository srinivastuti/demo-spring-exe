package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.UserRegistration;

public interface RegistrationRepository extends JpaRepository<UserRegistration, Integer>{

}

