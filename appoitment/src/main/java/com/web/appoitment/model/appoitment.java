package com.web.appoitment.model;

import java.sql.Date;

public class appoitment {

	private String patientName;
	private int patientAge;
	private Date dateOfBirth;
	private String bloodGroup;
	private String address;
	private String mobileNumber;
	private String emailId;
	private Date dareOfAppoitmnet;
	private String patientReport;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDareOfAppoitmnet() {
		return dareOfAppoitmnet;
	}
	public void setDareOfAppoitmnet(Date dareOfAppoitmnet) {
		this.dareOfAppoitmnet = dareOfAppoitmnet;
	}
	public String getPatientReport() {
		return patientReport;
	}
	public void setPatientReport(String patientReport) {
		this.patientReport = patientReport;
	}
	@Override
	public String toString() {
		return "appoitment [patientName=" + patientName + ", patientAge=" + patientAge + ", dateOfBirth=" + dateOfBirth
				+ ", bloodGroup=" + bloodGroup + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", dareOfAppoitmnet=" + dareOfAppoitmnet + ", patientReport=" + patientReport
				+ "]";
	}
	
	
	
	
	
	
}
