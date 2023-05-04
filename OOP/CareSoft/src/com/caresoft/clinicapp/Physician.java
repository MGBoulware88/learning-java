package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	//New attribute
	private ArrayList<String> patientNotes;
	//constructor
	public Physician(Integer id) {
		super(id);
		this.patientNotes = new ArrayList<String>();
	}
	//interface methods
	public boolean assignPin(int pin) {
		//PIN must be exactly 4 digits
		boolean isValidPIN = (String.valueOf(pin).length() == 4 ? true : false);
  		if (isValidPIN) {
  			this.pin = pin;
  			return true;
  		} else return false;
	}
	public boolean accessAuthorized(Integer confirmAuthID) {
		return (confirmAuthID.equals(this.id) ? true : false);
	}
	//class methods
	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported by ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s\n", notes);
		this.patientNotes.add(report);
	}
	//G&S methods
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
