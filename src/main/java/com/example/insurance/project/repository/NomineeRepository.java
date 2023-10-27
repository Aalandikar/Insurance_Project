package com.example.insurance.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.insurance.project.model.Nominee;

@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Integer> {

}
