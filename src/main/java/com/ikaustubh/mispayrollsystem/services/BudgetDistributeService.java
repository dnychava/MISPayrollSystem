package com.ikaustubh.mispayrollsystem.services;

import java.util.Set;

import com.ikaustubh.mispayrollsystem.entities.BudgetDistributeEntity;

public interface BudgetDistributeService {
	
	public Set<BudgetDistributeEntity> findByUnitRidAndSubActivityRids(long unitRid, String year, Set<Long> subActivityRids );

}
