package com.ikaustubh.mispayrollsystem.services;

import com.ikaustubh.mispayrollsystem.custom.exceptions.NotFoundException;
import com.ikaustubh.mispayrollsystem.dto.EmployeeDTO;
import com.ikaustubh.mispayrollsystem.dto.ResponseDTO;

/**
 * 
 * @author Dnyaneshwar
 * @since 01-July-2021
 */
public interface Employee {
	
	/**
	 * This method is creating new <code>Employee</code> in DB
	 * and returning the <code>Employee ID</code> 
	 * @param empDTO the Employee DTO
	 * @return the new created <code>Employee ID</code> or null value.
	 * @throws NotFoundException If Designation or Unit not found in DB
	 * @throws Exception
	 */
	public String save(EmployeeDTO empDTO) throws NotFoundException;

}
