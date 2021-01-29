package com.web.appoitment.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.appoitment.bo.appoitmentBo;
import com.web.appoitment.model.appoitment;



@RestController
@RequestMapping("/admin")
public class AdminController 
{
	private appoitmentBo appoitmentBo;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value ="/addData", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addData(HttpServletRequest request, HttpServletResponse response,@RequestBody appoitment appoitment) throws Exception
	{
	
				final String methodName = "EnterInDb()";
				
				try {
					appoitmentBo.addData(appoitment);
				}catch(Exception e)
				{
					
					return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
				}
				
				return new ResponseEntity( HttpStatus.OK);
	}


}
