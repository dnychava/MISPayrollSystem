package com.ikaustubh.mispayrollsystem.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ikaustubh.mispayrollsystem.dto.FMRReportFilterDTO;
import com.ikaustubh.mispayrollsystem.entities.ActivityEntity;
import com.ikaustubh.mispayrollsystem.entities.BudgetDistributeEntity;
import com.ikaustubh.mispayrollsystem.entities.ExpenditureEntity;
import com.ikaustubh.mispayrollsystem.wrapper.ExpenditureWrapper;

public interface ExpenditureService {

	public Set<ExpenditureEntity> findByUnitRidAndSubActivityRids(long unitRid, Set<Long> subActivityRids);

	public Set<ExpenditureEntity> findByUnitRidAndSubActivityRids(long unitRid, String year, Set<Long> subActivityRids);

	public Set<ExpenditureEntity> findByUnitRidAndSubActivityRids(long unitRid, String year,
			LocalDateTime reportingMonth, Set<Long> subActivityRids);

	public Map<Long, ExpenditureWrapper> getPrograssiveAmtAndBudget(long unitRid, String year, Set<Long> subActivityRids,
			boolean isFeatchBudgetData);
	
	public Map<Long, ExpenditureWrapper> getPrograssiveAmtAndBudget(long unitRid, String year, Set<Long> subActivityRids,
			boolean isFeatchBudgetData, int reportingMonth);
	
	public ExpenditureEntity findByUnitRidAndSubActivityRids(long unitRid, String year,
			long subActivityRid);
	
	public List<BudgetDistributeEntity> findBudgetList(String unitName, String year);
	
	public List<ExpenditureEntity> saveAll(List<ExpenditureEntity> entities);

	public void saveOrUpdate(List<ExpenditureEntity> expenditureEntities);
	
	/**
	 * 
	 * @param mainHeadPrmRid
	 * @param financialYear
	 * @return
	 * 
	 */
	public List<ActivityEntity> getAllParentActivity(long mainHeadPrmRid, String financialYear);
	
	/**
	 * 
	 * @param fmrReportFilterDTO
	 * @param activityRidList
	 * @return
	 */
	public List<ExpenditureEntity> getAllExpenditureUsingFilter(FMRReportFilterDTO fmrReportFilterDTO, List<Long> activityRidList);
	
	/**
	 * 
	 * @param fmrReportFilterDTO
	 * @param activityRidList
	 * @return
	 */
	public List<BudgetDistributeEntity> getAllBudgetSharedUsingFilter(FMRReportFilterDTO fmrReportFilterDTO, List<Long> activityRidList);
}
