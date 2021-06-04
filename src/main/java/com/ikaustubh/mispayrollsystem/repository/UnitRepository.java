package com.ikaustubh.mispayrollsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikaustubh.mispayrollsystem.entities.BudgetDistributeEntity;
import com.ikaustubh.mispayrollsystem.entities.UnitEntity;
import com.ikaustubh.mispayrollsystem.services.BudgetDistributeService;

/**
 * 
 * @author Dnyaneshwar
 * @since 7-Nov-2018
 */
public interface UnitRepository extends JpaRepository<UnitEntity, Long> {

}
