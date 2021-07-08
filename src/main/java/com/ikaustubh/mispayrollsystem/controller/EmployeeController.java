package com.ikaustubh.mispayrollsystem.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikaustubh.mispayrollsystem.comman.Constants;
import com.ikaustubh.mispayrollsystem.custom.exceptions.NotFoundException;
import com.ikaustubh.mispayrollsystem.dto.EmployeeDTO;
import com.ikaustubh.mispayrollsystem.dto.ResponseDTO;
import com.ikaustubh.mispayrollsystem.services.Employee;

@RestController
@RequestMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private ResponseDTO resposeDTO;

	@Autowired
	private Employee empService;
	
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping(value = "/addEmp", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<ResponseDTO> saveEmp( @RequestBody EmployeeDTO requestBody){
		String methodName = "saveEmp |";
		logger.info( methodName + Constants.START);
		ResponseEntity<ResponseDTO> resp;
		try {
			logger.info( methodName+" requestBody["+requestBody+"]" );
			String newEmpId = empService.save(requestBody);
			resposeDTO.setMessage("The new employee is created successfully. The Employee ID is "+newEmpId );
			resposeDTO.setStatus(HttpStatus.CREATED.name());
			resp = new ResponseEntity<>(resposeDTO, HttpStatus.OK);
		} catch (NotFoundException notFoundException) {
			logger.error( methodName + notFoundException.getMessage(), notFoundException);
			resposeDTO.setErrors(notFoundException.getMessage());
			resp = new ResponseEntity<>(resposeDTO, HttpStatus.BAD_REQUEST);
		}
		catch (Exception e) {
			logger.error( methodName + "While saving the data", e);
			resposeDTO.setErrors(e.getMessage());
			resp = new ResponseEntity<>(resposeDTO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		logger.info( methodName + Constants.END);
		return resp;
	}

}
