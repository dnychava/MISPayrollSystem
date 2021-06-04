package com.ikaustubh.mispayrollsystem.dao;

import java.util.Set;

import com.ikaustubh.mispayrollsystem.entities.BudgetDistributeEntity;

public interface BudgetDistributeDao {
	
	public Set<BudgetDistributeEntity> findByUnitRidAndSubActivityRids(long unitRid, String year, Set<Long> subActivityRids );

}
