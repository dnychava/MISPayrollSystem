package com.ikaustubh.mispayrollsystem.services.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.dao.MainSubActivityDao;
import com.ikaustubh.mispayrollsystem.entities.ActivityEntity;
import com.ikaustubh.mispayrollsystem.services.MainSubActivityService;

@Service
@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRES_NEW, readOnly=true)
public class MainSubActivityServiceImpl implements MainSubActivityService {

	@Autowired
	private MainSubActivityDao mainSubActivityDao;
	
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRES_NEW, readOnly=true)
	@Override
	public List<ActivityEntity> findByRidsAndActivityName(Set<String> newCodes, Set<String> activityNames) {
		
		return mainSubActivityDao.findByRidsAndActivityName(newCodes, activityNames);
	}
}
