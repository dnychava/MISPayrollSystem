package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.entities.DesignationEntity;

/**
 * This class store the <code>Designation</code> of employee.
 * 
 * @author Dnyaneshwar Chavan
 * @since 28-June-2021
 */
@Repository
@Transactional
public interface DesinationRepository extends JpaRepository<DesignationEntity, Long> {

}
