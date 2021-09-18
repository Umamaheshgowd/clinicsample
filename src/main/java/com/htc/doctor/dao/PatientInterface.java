package com.htc.doctor.dao;

import java.util.List;
import com.htc.doctor.entity.Patient;



public interface PatientInterface {
	public boolean addPatient(Patient patient);
	public Patient getPatientById(long patientId);
	public Patient getByFirstName(String patientFirstName);
	public Patient getByLastName(String patientLastName);
	public Patient getByPhoneNumber(long phoneNumber);
	
	

}
