package com.ikaustubh.mispayrollsystem.services.impl;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.comman.Constants;
import com.ikaustubh.mispayrollsystem.controller.EmployeeController;
import com.ikaustubh.mispayrollsystem.custom.exceptions.NotFoundException;
import com.ikaustubh.mispayrollsystem.dto.EmployeeDTO;
import com.ikaustubh.mispayrollsystem.dto.ResponseDTO;
import com.ikaustubh.mispayrollsystem.entities.AddressEntity;
import com.ikaustubh.mispayrollsystem.entities.BankEntity;
import com.ikaustubh.mispayrollsystem.entities.DesignationEntity;
import com.ikaustubh.mispayrollsystem.entities.EmployeeEntity;
import com.ikaustubh.mispayrollsystem.entities.PFEntity;
import com.ikaustubh.mispayrollsystem.entities.UnitEntity;
import com.ikaustubh.mispayrollsystem.enums.AddressType;
import com.ikaustubh.mispayrollsystem.repository.DesinationRepository;
import com.ikaustubh.mispayrollsystem.repository.EmployeeRepository;
import com.ikaustubh.mispayrollsystem.repository.UnitRepository;
import com.ikaustubh.mispayrollsystem.services.Employee;

/***
 * 
 * 
 * @author Dnyaneshwar Chavan
 * @since 30-June-2021
 *
 */
@Service
class EmployeeImpl implements Employee {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private DesinationRepository desinationRepo;

	@Autowired
	private UnitRepository unitRepo;

	@Autowired
	private EmployeeRepository empRepo;

	private Authentication auth = null;

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, rollbackFor = { Throwable.class })	
	@Override
	public String save(EmployeeDTO empDTO) throws NotFoundException {
		String methodName = "save |";
		logger.info(methodName + Constants.START);
		String empId = null;
		try {
			EmployeeEntity empEntity = convertEmpDTOToEmpEntity(empDTO);
			EmployeeEntity saveEmpEntity = empRepo.save(empEntity);
			empId = saveEmpEntity.getRid();
			logger.info( methodName + "New employee created successfully and empId["+empId+"]" );
		} catch (NotFoundException notFoundException) {
			logger.error( methodName + notFoundException.getMessage(), notFoundException);
			throw notFoundException;
		} catch (Exception e) {
			logger.error( methodName + e.getMessage(), e);
			throw e;
		}
		return empId;
	}

	/***
	 * 
	 * This method is converting <code>empDTO</code> to <code>empEntity</code>
	 * 
	 * @param empDTO the employee DTO
	 * @return the null object if runtime exception is occurred
	 * or else return the Employee Entity object.
	 * @throws 
	 * NotFoundException If Designation or Unit not found in DB.
	 */
	private EmployeeEntity convertEmpDTOToEmpEntity(EmployeeDTO empDTO) throws NotFoundException {
		String methodName = "convertEmpDTOToEmpEntity |";
		logger.info(methodName + Constants.START);
		EmployeeEntity empEntity = null;
		try {
			auth = SecurityContextHolder.getContext().getAuthentication();
			empEntity = new EmployeeEntity();
			Optional<DesignationEntity> desinationOptional = desinationRepo.findById(empDTO.getDesignation().getId());
			if (desinationOptional.isPresent()) {
				empEntity.setDesignationEntity(desinationOptional.get());
			} else {
				throw new NotFoundException(" Selected designation[" + empDTO.getDesignation().getName() + "] or Id["
						+ empDTO.getDesignation().getId() + "] not found");
			}

			Optional<UnitEntity> unitOptional = unitRepo.findById(empDTO.getUnit().getId());
			if (unitOptional.isPresent()) {
				empEntity.setUnitEntity(unitOptional.get());
			} else {
				throw new NotFoundException(" Selected Unit[" + empDTO.getDesignation().getName() + "] or Id["
						+ empDTO.getDesignation().getId() + "] not found");
			}

			// Preparing the AddreesEntity
			AddressEntity addressEntity = new AddressEntity();
			addressEntity.setAddress(empDTO.getAddress().getAddress());
			addressEntity.setTalk(empDTO.getAddress().getTalk());
			addressEntity.setDist(empDTO.getAddress().getDist());
			addressEntity.setPinCode(empDTO.getAddress().getPinCode());
			addressEntity.setPhoneNo(empDTO.getAddress().getPhoneNo());
			addressEntity.setyCreatedDateAndTime(LocalDateTime.now());
			addressEntity.setType(AddressType.PERMANANT.name());
			addressEntity.setyCreatedBy(auth.getName());
			empEntity.setAddressEntity(addressEntity);

			// Preparing the Bank
			BankEntity bankEntity = new BankEntity();
			bankEntity.setAccountNo(empDTO.getBank().getAccountNo());
			bankEntity.setName(empDTO.getBank().getName());
			bankEntity.setIfscCode(empDTO.getBank().getIfscCode());
			bankEntity.setyCreatedDateAndTime(LocalDateTime.now());
			bankEntity.setyCreatedBy(auth.getName());
			empEntity.setBankEntity(bankEntity);

			/*
			 * Checking the PF isApplicable or not. If applicable then Preparing the
			 * PFEntity and assigning to empEnity. Otherwise not creating the PFEntity
			 */
			logger.info(methodName + " isEPFApplicable[" + empDTO.getPf().getIsEPFApplicable() + "]");
			if (empDTO.getPf().getIsEPFApplicable().booleanValue()) {
				// Preparing the PF
				PFEntity pfEntity = new PFEntity();
				pfEntity.setUanNo(empDTO.getPf().getUanNo());
				pfEntity.setMemberId(empDTO.getPf().getMemberId());
				pfEntity.setEpfName(empDTO.getPf().getEpfName());
				pfEntity.setyCreatedDateAndTime(LocalDateTime.now());
				pfEntity.setyCreatedBy(auth.getName());
				pfEntity.setEmplEntity(empEntity);
				empEntity.setPfEntity(pfEntity);
			}
			// Preparing the empEntity
			empEntity.setFirstName(empDTO.getFirstName());
			empEntity.setMidleName(empDTO.getMiddleName());
			empEntity.setLastName(empDTO.getLastName());
			empEntity.setGender(empDTO.getGender());
			empEntity.setDateOfBirth(empDTO.getDateOfBirth());
			// TODO :- Need to add Date of joining.
			empEntity.setHandicap(empDTO.getIsHandicap().booleanValue());
			empEntity.setAdharNo(empDTO.getAdharNo());
			empEntity.setMobileNo(empDTO.getMobileNo());
			empEntity.setEmailId(empDTO.getEmailId());

			empEntity.setEPFApplicable(empDTO.getPf().getIsEPFApplicable().booleanValue());

		} catch (NotFoundException notFoundException) {
			logger.error( methodName + notFoundException.getMessage(), notFoundException);
			throw notFoundException;
		} catch (Exception e) {
			logger.error( methodName + e.getMessage(), e);
			throw e;
		}
		logger.info(methodName + Constants.END);
		return empEntity;
	}

}
