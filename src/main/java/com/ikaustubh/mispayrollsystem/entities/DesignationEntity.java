package com.ikaustubh.mispayrollsystem.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * This entity is represent the designation of the employee <BR>
 * Eg. 1. Pharmasist, 2. NCD, 3. Nurse. 
 * 
 * @author Dnyaneshwar Chavan
 * @since 05-June-2021
 */

@Entity
@Table(name = "DESIGNATION")
//@Scope("global-session")
public class DesignationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DESIGNATION_RID", length = 10, nullable = false)
	private long rid;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "designationEntity", cascade = CascadeType.ALL)
	private Set<EmployeeEntity> emplEntities = new HashSet<EmployeeEntity>();
	
	@Column(name = "DESIGNATION_NAME", nullable = false, length = 50)
	private String name;
	
	@Column(name = "DESIGNATION_FMR_CODE", nullable = false, length = 50)
	private String fmrCode;
	
	@Column(name = "DESIGNATION_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "DESIGNATION_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "DESIGNATION_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "DESIGNATION_MODIFIED_TIMESTAMP", nullable = true)
	private LocalDateTime zModifiedDateAndTime;

	/**
	 * @return the emplEntities
	 */
	public Set<EmployeeEntity> getEmplEntities() {
		return emplEntities;
	}

	/**
	 * @param emplEntities the emplEntities to set
	 */
	public void setEmplEntities(Set<EmployeeEntity> emplEntities) {
		this.emplEntities = emplEntities;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fmrCode
	 */
	public String getFmrCode() {
		return fmrCode;
	}

	/**
	 * @param fmrCode the fmrCode to set
	 */
	public void setFmrCode(String fmrCode) {
		this.fmrCode = fmrCode;
	}

	/**
	 * @return the yCreatedBy
	 */
	public String getyCreatedBy() {
		return yCreatedBy;
	}

	/**
	 * @param yCreatedBy the yCreatedBy to set
	 */
	public void setyCreatedBy(String yCreatedBy) {
		this.yCreatedBy = yCreatedBy;
	}

	/**
	 * @return the yCreatedDateAndTime
	 */
	public LocalDateTime getyCreatedDateAndTime() {
		return yCreatedDateAndTime;
	}

	/**
	 * @param yCreatedDateAndTime the yCreatedDateAndTime to set
	 */
	public void setyCreatedDateAndTime(LocalDateTime yCreatedDateAndTime) {
		this.yCreatedDateAndTime = yCreatedDateAndTime;
	}

	/**
	 * @return the zModifiedBy
	 */
	public String getzModifiedBy() {
		return zModifiedBy;
	}

	/**
	 * @param zModifiedBy the zModifiedBy to set
	 */
	public void setzModifiedBy(String zModifiedBy) {
		this.zModifiedBy = zModifiedBy;
	}

	/**
	 * @return the zModifiedDateAndTime
	 */
	public LocalDateTime getzModifiedDateAndTime() {
		return zModifiedDateAndTime;
	}

	/**
	 * @param zModifiedDateAndTime the zModifiedDateAndTime to set
	 */
	public void setzModifiedDateAndTime(LocalDateTime zModifiedDateAndTime) {
		this.zModifiedDateAndTime = zModifiedDateAndTime;
	}

	/**
	 * @return the rid
	 */
	public long getRid() {
		return rid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesignationEntity [rid=" + rid + ", name=" + name + ", fmrCode=" + fmrCode
				+ ", yCreatedBy=" + yCreatedBy + ", yCreatedDateAndTime=" + yCreatedDateAndTime + ", zModifiedBy="
				+ zModifiedBy + ", zModifiedDateAndTime=" + zModifiedDateAndTime + "]";
	}
	
}
