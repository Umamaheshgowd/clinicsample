package com.htc.doctor.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.htc.doctor.entity.Patient;
@Repository
public class PatientImplementation implements PatientInterface{
	
	List<Patient> patientList=new ArrayList<>();
	Patient patient =null;
	@Override
	public boolean addPatient(Patient patient) {
		// TODO Auto-generated method stub
		boolean addPatientFlag=false;
		if(patient!=null) {
			patientList.add(patient);
			addPatientFlag=true;
		}
		return addPatientFlag;
	}

	@Override
	public Patient getPatientById(long patientId){
		
		
		for(Patient patients:patientList) {
			if(patients.getPatientId()==patientId) {
				patient=patients;
				break;
			}
		}
		return patient;
	}

	@Override
	public Patient getByFirstName(String patientFirstName) {
		// TODO Auto-generated method stub
		for(Patient patients:patientList) {
			if(patients.getPatientFirstName()==patientFirstName) {
				patient=patients;
				break;
			}
		}
		return patient;
	}

	@Override
	public Patient getByLastName(String patientLastName) {
		// TODO Auto-generated method stub
		for(Patient patients:patientList) {
			if(patients.getPatientLastName()==patientLastName) {
				patient=patients;
				break;
			}
		}
		return patient;
	}

	@Override
	public Patient getByPhoneNumber(long phoneNumber) {
		// TODO Auto-generated method stub
		for(Patient patients:patientList) {
			if(patients.getPhoneNumber()==phoneNumber) {
				patient=patients;
				break;
			}
		}
		return patient;
	}

	
}