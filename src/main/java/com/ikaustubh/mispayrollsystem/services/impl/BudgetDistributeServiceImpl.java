package com.ikaustubh.mispayrollsystem.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.dao.BudgetDistributeDao;
import com.ikaustubh.mispayrollsystem.entities.BudgetDistributeEntity;
import com.ikaustubh.mispayrollsystem.repository.BudgetDistributeRepository;
import com.ikaustubh.mispayrollsystem.services.BudgetDistributeService;

@Service
public class BudgetDistributeServiceImpl implements BudgetDistributeService {
	
	@Autowired
	private BudgetDistributeRepository budgetDistributeRepo;

	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED, readOnly=true)
	@Override
	public Set<BudgetDistributeEntity> findByUnitRidAndSubActivityRids(long unitRid, String year,
			Set<Long> subActivityRids) {
		return budgetDistributeRepo.findByUnitRidAndSubActivityRids(unitRid, year, subActivityRids);
	}
}
