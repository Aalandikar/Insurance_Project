package com.example.insurance.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.insurance.project.model.PaymentMode;

@Repository
public interface PaymentModeRepository extends JpaRepository<PaymentMode, Integer> {

}
