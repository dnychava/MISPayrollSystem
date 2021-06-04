/**
 * 
 */
package com.ikaustubh.mispayrollsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikaustubh.mispayrollsystem.entities.RoleEntity;

/**
 * @author Dnyaneshwar
 *
 */

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    //RoleEntity findByRole(String role);

}

