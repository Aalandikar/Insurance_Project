package com.example.insurance.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.insurance.project.model.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer>{
	
     //public Premium findById(Integer premiumId);
		}
