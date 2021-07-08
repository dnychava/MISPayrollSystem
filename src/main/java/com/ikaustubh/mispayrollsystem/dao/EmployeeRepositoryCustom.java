/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dao;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.entities.EmployeeEntity;

/**
 * @author Dnyaneshwar
 * @since 30-June-2021
 */
public interface EmployeeRepositoryCustom {

	
	public EmployeeEntity saveEmp(EmployeeEntity empEntity);
	
}
