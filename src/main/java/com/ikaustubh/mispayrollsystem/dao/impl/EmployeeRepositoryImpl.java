/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.dao.EmployeeRepositoryCustom;
import com.ikaustubh.mispayrollsystem.entities.EmployeeEntity;

/**
 * 
 * 
 * @author Dnyaneshwar Chavan
 * @since 30-June-2021
 *
 */
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * 
	 */
	public EmployeeRepositoryImpl() {

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, rollbackFor = { RuntimeException.class,
			Exception.class })
	@Override
	public EmployeeEntity saveEmp(EmployeeEntity empEntity) {
		entityManager.merge(empEntity);
		return empEntity;
	}

}
