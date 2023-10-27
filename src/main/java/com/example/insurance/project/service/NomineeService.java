package com.example.insurance.project.service;

import java.util.List;
import com.example.insurance.project.model.Nominee;

public interface NomineeService {

	public Nominee saveNominee(Nominee nominee);

	public Nominee updateNominee(Nominee nominee);
	
	public void deleteNominee(Integer nomineeId);

	public Nominee getNomineeById(Integer nomineeId);

	public List<Nominee> getAllNominees();


}
