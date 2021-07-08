package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.entities.SalaryEntity;

/**
 * This class store the <code>Employee</code> detail information.
 * 
 * @author Dnyaneshwar Chavan
 * @since 28-June-2021
 */
@Repository
@Transactional
public interface SalaryRepository extends JpaRepository<SalaryEntity, Long> {

}
