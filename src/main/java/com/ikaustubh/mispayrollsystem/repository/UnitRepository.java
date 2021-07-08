package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.entities.UnitEntity;

/**
 * 
 * @author Dnyaneshwar
 * @since 7-Nov-2018
 */
@Repository
@Transactional
public interface UnitRepository extends JpaRepository<UnitEntity, Long> {

}
