package com.htc.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.htc.doctor.dao.PatientInterface;
import com.htc.doctor.entity.Patient;

@RestController
@RequestMapping("/api") 
public class PatientController {
	
	@Autowired
	private PatientInterface patientInterface;
	@GetMapping("/patients/{patientId}") 
	public Patient getPatientById(@PathVariable Long patientId) {
		
		Patient patient =null;
		patient=patientInterface.getPatientById(patientId);
		return patient;
		
	}

	@GetMapping("/patients/{patientLastName}") 
	public Patient getPatientByLastName(@PathVariable String patientLastName) {
		
		Patient patient =null;
		patient=patientInterface.getByFirstName(patientLastName);
		return patient;
		
	}
	
	
	@PostMapping("/patients") 
	public boolean createProduct(@RequestBody Patient patient) {
		   
		 return patientInterface.addPatient(patient);
	}
	
}
