package com.ikaustubh.mispayrollsystem.dao;

import java.util.List;
import java.util.Set;

import com.ikaustubh.mispayrollsystem.entities.ActivityEntity;

public interface MainSubActivityDao {

	public List<ActivityEntity> findByRidsAndActivityName(Set<String> newCodes, Set<String> activityNames);

}
