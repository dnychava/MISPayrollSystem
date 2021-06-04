package com.ikaustubh.mispayrollsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikaustubh.mispayrollsystem.entities.ActivityEntity;

public interface ActivityRepo extends JpaRepository<ActivityEntity, Long> {
	
	//public List<ActivityEntity> findAllOrderByRidAsc();
}
