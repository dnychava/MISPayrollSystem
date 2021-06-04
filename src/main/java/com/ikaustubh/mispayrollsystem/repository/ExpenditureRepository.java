package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikaustubh.mispayrollsystem.dao.ExpenditureDao;
import com.ikaustubh.mispayrollsystem.entities.ExpenditureEntity;

public interface ExpenditureRepository extends JpaRepository<ExpenditureEntity, Long>, ExpenditureDao {
	
}
