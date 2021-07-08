/**
 * 
 */
package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikaustubh.mispayrollsystem.entities.RecordStatusEntity;

/**
 * @author Dnyaneshwar Chavan
 * @since 07-Oct-2018
 *
 */
@Repository
@Transactional
public interface RecordStatusRepository {//extends JpaRepository<RecordStatusEntity, Long> {
	RecordStatusEntity findByName(String name);
}
