package com.ikaustubh.mispayrollsystem.services;

import java.util.List;
import java.util.Set;

import com.ikaustubh.mispayrollsystem.entities.ActivityEntity;

public interface MainSubActivityService {

	public List<ActivityEntity> findByRidsAndActivityName(Set<String> newCodes, Set<String> activityNames);

}
