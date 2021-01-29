package com.web.appoitment.eo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.web.appoitment.model.appoitment;

@Service
public class appoitmentEo {
	
	@Autowired
	private com.web.appoitment.dao.appoitmentDao appoitmentDao;
	public String addData(appoitment appoitment) {
		   
		
		String Response="Error Entering  Details";

		StringBuilder responseBuilder=new StringBuilder(" ADDING UPDATING USER");
		try{
			responseBuilder = appoitmentDao.addData(appoitment);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return responseBuilder.toString();
	}
}
