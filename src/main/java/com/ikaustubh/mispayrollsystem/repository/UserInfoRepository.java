/**
 * 
 */
package com.ikaustubh.mispayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikaustubh.mispayrollsystem.entities.UserInfoEntity;

/**
 * @author Dnyaneshwar Chavan
 * @since 07-Oct-2018
 *
 */
@Repository("userInfoRepository")
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
	UserInfoEntity findByUsername(String username);
}
