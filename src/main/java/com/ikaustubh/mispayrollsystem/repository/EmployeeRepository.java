package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.dao.EmployeeRepositoryCustom;
import com.ikaustubh.mispayrollsystem.entities.EmployeeEntity;

/**
 * This class store the <code>Employee</code> detail information.
 * 
 * @author Dnyaneshwar Chavan
 * @since 28-June-2021
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>, EmployeeRepositoryCustom {
	
}
