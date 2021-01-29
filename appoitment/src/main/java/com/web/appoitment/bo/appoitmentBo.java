package com.web.appoitment.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.appoitment.eo.appoitmentEo;
import com.web.appoitment.model.appoitment;

@Component
public class appoitmentBo {
	@Autowired
	private appoitmentEo appoitmentEo;
	
	public String addData(appoitment appoitment) {
		
		
		String response = appoitmentEo.addData(appoitment);
		return response;
	}

}
