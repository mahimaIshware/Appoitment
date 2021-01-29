package com.web.appoitment.dao;

import java.sql.Timestamp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.web.appoitment.model.appoitment;

@Component
public class appoitmentDao {
	
	private transient JdbcTemplate jdbcTemplate;

	@Autowired
	private transient DataSource datasource;
	
	
	@SuppressWarnings("deprecation")
	public StringBuilder addData(appoitment appoitment) {
		final String methodName = "AddupdateCategories()";
		StringBuilder response = new StringBuilder("ERROR ADDING UPDATING CATEGORIES");
		boolean exist=false;
		String query="select 1 from doctors_appoitment where dare_of_appoitmnet=? ";
		
		 exist=jdbcTemplate.queryForObject(query,new Object[] { appoitment.getDareOfAppoitmnet()},boolean.class);
		 try {
		 if (exist) {
			 response=  new StringBuilder("Doctor is not free today");
		 }
		 else {
				String INSERT_QUERY = "INSERT INTO doctors_appoitment (patient_name,patient_age,date_of_birth,blood_group,address,mobile_number,email_id,dare_of_appoitmnet,patient_report) VALUES(?,?,?,?,?,?,?,?,?,?)";
				jdbcTemplate.update(INSERT_QUERY,appoitment.getPatientName(),appoitment.getPatientAge(),appoitment.getDateOfBirth(),appoitment.getBloodGroup(),appoitment.getAddress(),
						appoitment.getMobileNumber(),appoitment.getEmailId(),appoitment.getDareOfAppoitmnet(),appoitment.getPatientReport());
				
				return response = new StringBuilder("CATEGORIES ADDED SUCCESSFULLY");

		}
		 }
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
		return response;
}
}